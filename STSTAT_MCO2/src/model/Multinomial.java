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
	String definitionOfSuccess;
	String log;
	
	public Multinomial(double k, double size, double[] prob)
	{
		this.k = k;
		this.size = size;
		this.prob = prob;
		log = "Multinomial Distribution \r\n\r\n"; // for the text file
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
            }
            /*connection.eval("p1="+prob[0]);
            connection.eval("p2="+prob[1]);
            connection.eval("p3="+prob[2]);
            connection.eval("p4="+prob[3]);*/
            
            String probability="c(";
            for(int i = 0; i < prob.length; i++)
            {
            	probability += "p" + i;
            	
            	if(i != prob.length-1)
            		probability += ",";
            	else
            		probability += ")";
            }
            System.out.println(probability);
            
            REXP x;
            x = connection.eval("rmultinom("+k+","+size+","+probability+")");
            double[][] results = x.asDoubleMatrix();
            
            //Averaging the actual results
            double average = 0;
            for (int i = 0; i < prob.length; i++) 
            {
                //Displaying experiment results
            	for (int j = 0; j < k; j++)
            	{
            		log += results[i][j] + " ";	
            	}
            	//average+=results[i];
            	log += "\r\n";
             }
            
            //average = average/results.length;
            log += "The average successes of p1 is "+average+"\r\n";
            log += "The average successes of p2 is "+average+"\r\n";
            log += "The average successes of p3 is "+average+"\r\n";
            log += "The average successes of p4 is "+average+"\r\n";
            
            //Actual and Ideal Probabilities
            //double actual = ?;
            //log += "The actual probability is "+actual);
            //double ideal = ?;
            //log += "The ideal probability is "+ideal);
            
            // Graphing for Actual Outcome Multinomial
            String rCode = "";
            rCode = "setwd(\"~/\")";//set directory
			connection.eval(rCode);
			rCode = "getwd()";
			connection.eval(rCode);
			rCode = "y<- "+"rmultinom("+k+","+size+","+probability+")";
			connection.eval(rCode);
			rCode = "png(filename = \"ActualOutcomeMultinomial"+k+"Experiments"+size+"Size"+probability+"probability.png\")";
			connection.eval(rCode);
			rCode = "barplot(table(y))";
			connection.eval(rCode);				
			rCode = "dev.off()";
			connection.eval(rCode);
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
}
