package model;

import org.rosuda.REngine.REXP;
import org.rosuda.REngine.REXPMismatchException;
import org.rosuda.REngine.Rserve.RConnection;
import org.rosuda.REngine.Rserve.RserveException;

public class Binomial {
	
	// Variables for the input
	double k;
	double size;
	double prob;
	String definitionOfSuccess;
	String log;
	
	String indexTextFile;
	
	public Binomial(double k, double size, double prob, String definitionOfSuccess)
	{
		this.k = k;
		this.size = size;
		this.prob = prob;
		this.definitionOfSuccess = definitionOfSuccess;
		log = "Binomial Distribution \r\n\r\n"; // for the text file
		indexTextFile = "";
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
            REXP x;
            x = connection.eval("rbinom("+k+","+size+","+prob+")");
            int[] results = x.asIntegers();
            
            log += "k = " + k + "\r\nsize = " + size + "\r\nprob = " + prob + "\r\ndefinition of success = " + definitionOfSuccess + "\r\n";
            
            //Averaging the actual results
            double average=0;
            for (int i = 0; i < results.length; i++) 
            {
                //Displaying experiment results
            	log += "Experiment #"+i+" result: "+results[i]+" successes\r\n";
                average += results[i];
             }
            average = average/results.length;
            log += "The average successes is "+average+"\r\n";
            
            //Actual and Ideal Probabilities
            double actual = average/size;
            log += "The actual probability is "+actual+"\r\n";
            double ideal = prob;
            log += "The ideal probability is "+ideal+"\r\n";
            
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
    		rCode = "y<- "+"rbinom("+  k + "," + size + "," + prob + ")";
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
//    		rCode = "x<- "+"dbinom(0:"+  k + "," + size + "," + prob + ")";
//    		connection.eval(rCode);
    		rCode = "png(filename = \""+indexTextFile+"-Ideal.png\")";
    		connection.eval(rCode);
    		rCode = "barplot(dbinom(0:"+  k + "," + size + "," + prob + "))";
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
