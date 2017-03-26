package model;

import org.rosuda.REngine.REXP;
import org.rosuda.REngine.REXPMismatchException;
import org.rosuda.REngine.Rserve.RConnection;
import org.rosuda.REngine.Rserve.RserveException;

public class Multinomial {
	// Variables for the input
	double k;
	double size;
	double[] prob;
	double[] probSelected;
	String definitionOfSuccess;
	String log;
	
	String indexTextFile;
	String probability;
	String probabilitySelected;
	
	public Multinomial(double k, double size, double[] prob, double[] probSelected)
	{
		this.k = k;
		this.size = size;
		this.prob = prob;
		this.probSelected = probSelected;
		log = "Multinomial Distribution \r\n\r\n"; // for the text file
		indexTextFile = ""; // for naming of graphs
		probability = ""; // the c() list of all probabilities; for graphing purposes
		probabilitySelected = ""; // the c() list of all selected probabilities; for graphing purposes
	}
	
	public String execute()
	{
		RConnection connection = null;
        try 
        {
            /* Create a connection to Rserve instance running
             * on default port 6311
             */
            connection = new RConnection();
            
            for(int i = 0; i < prob.length; i++)
            {
            	connection.eval("p" + i + "=" + prob[i]);
            	connection.eval("pS" + i + "=" + probSelected[i]);
            }
            /*connection.eval("p1="+prob[0]);
            connection.eval("p2="+prob[1]);
            connection.eval("p3="+prob[2]);
            connection.eval("p4="+prob[3]);*/
            
            probability="c(";
            for(int i = 0; i < prob.length; i++)
            {
            	probability += "p" + i;
            	
            	if(i != prob.length-1)
            		probability += ",";
            	else
            		probability += ")";
            }
            System.out.println(probability);
            
            probabilitySelected="c(";
            for(int i = 0; i < prob.length; i++)
            {
            	probabilitySelected += "pS" + i;
            	
            	if(i != prob.length-1)
            		probabilitySelected += ",";
            	else
            		probabilitySelected += ")";
            }
            System.out.println(probabilitySelected);
            
            REXP x;
            x = connection.eval("rmultinom("+k+","+size+","+probability+")");
            double[][] results = x.asDoubleMatrix();
            
            //Averaging the actual results
            double[] average = new double[prob.length];
            
            for (int i = 0; i < prob.length; i++) 
            {
                //Displaying experiment results
            	for (int j = 0; j < k; j++)
            	{
            		average[i] += results[i][j];
            		log += results[i][j] + " ";	
            	}
//            	average += results[i];
            	log += "\r\n";
             }
            
            //average = average/results.length;
            for(int i = 0; i < prob.length; i++)
            {
            	average[i] = average[i]/k;
            	log += "The average successes of p"+ i + " is " + (average[i]) + "\r\n";
            }
            //Actual and Ideal Probabilities
            //double actual = ?;
            //log += "The actual probability is "+actual);
            //double ideal = ?;
            //log += "The ideal probability is "+ideal);
            
        } 
        catch (RserveException e) 
        {
            e.printStackTrace();
        } 
        catch (REXPMismatchException e) 
        {
            e.printStackTrace();
        }
        finally
        {
            connection.close();
        }
        
        return log;
	}
	
	public void createGraphs(String indexTextFile)
	{
		RConnection connection = null;

        try 
        {
            /* Create a connection to Rserve instance running
             * on default port 6311
             */
            connection = new RConnection();

            // Graphing for Actual Outcome Binomial
            String rCode = "";
    		rCode = "setwd(\"~/\")";//set directory
    		connection.eval(rCode);
    		rCode = "getwd()";
    		connection.eval(rCode);
    		rCode = "y<- "+"rmultinom("+k+","+size+","+probability+")";
    		connection.eval(rCode);
    		rCode = "png(filename = \""+indexTextFile+"-Actual.png\")";
    		connection.eval(rCode);
    		rCode = "barplot(table(y))";
    		connection.eval(rCode);				
    		rCode = "dev.off()";
    		connection.eval(rCode);
    		
    		// Graphing for Ideal Outcome Binomial
    		rCode = "setwd(\"~/\")";//set directory
    		connection.eval(rCode);
    		rCode = "getwd()";
    		connection.eval(rCode);
//    		rCode = "x<- "+"dmultinom("+probabilitySelected+", size=NULL ,"+probability+")";
//    		connection.eval(rCode);
    		rCode = "png(filename = \""+indexTextFile+"-Ideal.png\")";
    		connection.eval(rCode);
    		rCode = "barplot(dmultinom("+probabilitySelected+", size=NULL ,"+probability+"))";
    		connection.eval(rCode);				
    		rCode = "dev.off()";
    		connection.eval(rCode);
        } 
        catch (RserveException e) 
        {
            e.printStackTrace();
        }
        finally
        {
            connection.close();
        }
		
	}
}
