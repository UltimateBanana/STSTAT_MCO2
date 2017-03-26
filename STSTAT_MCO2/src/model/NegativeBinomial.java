package model;

import org.rosuda.REngine.REXP;
import org.rosuda.REngine.REXPMismatchException;
import org.rosuda.REngine.Rserve.RConnection;
import org.rosuda.REngine.Rserve.RserveException;

public class NegativeBinomial {

	// Variables for the input
	double k;
	double size;
	double prob;
	String definitionOfSuccess;
	String log;
	
	public NegativeBinomial(double k, double size, double prob, String definitionOfSuccess)
	{
		this.k = k;
		this.size = size;
		this.prob = prob;
		this.definitionOfSuccess = definitionOfSuccess;
		log = "Negative Binomial Distribution \r\n\r\n"; // for the text file
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
            //R execution
            REXP x;
            x = connection.eval("rnbinom("+k+","+size+","+prob+")");
            int[] results = x.asIntegers();
            
            log += "k = " + k + "\r\nsize = " + size + "\r\nprob = " + prob + "\r\n";
            
            
            //Averaging the actual results
            double average=0;
            for (int i = 0; i < results.length; i++) {
                //Displaying experiment results
            	log += "Experiment #"+i+" result: "+results[i]+" failures"+"\r\n";
                average+=results[i];
             }
            
            average = average/results.length;
            log += "The average failures is "+average+"\r\n";
            
            //Actual and Ideal Probabilities
            double actual = 1-(average/(average+size));
            log += "The actual probability is "+actual+"\r\n";
            double ideal = prob;
            log += "The ideal probability is "+ideal+"\r\n";
            
            // Graphing for Actual Outcome Negative Binomial
            String rCode = "";
            rCode = "setwd(\"~/\")";//set directory
			connection.eval(rCode);
			rCode = "getwd()";
			connection.eval(rCode);
			rCode = "y<- "+"rnbinom("+  k + "," + size + "," + prob +")";
			connection.eval(rCode);
			rCode = "png(filename = \"ActualOutcomeNegativeBinomialDistribution"+k+"Experiments"+size+"Size"+prob+"probability.png\")";
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
