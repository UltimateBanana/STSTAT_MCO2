package model;

import org.rosuda.REngine.REXP;
import org.rosuda.REngine.REXPMismatchException;
import org.rosuda.REngine.Rserve.RConnection;
import org.rosuda.REngine.Rserve.RserveException;

public class Hypergeometric {
	// Variables for the input
	double ex;
	double nn;
	double m;
	double n;
	double k;
	String definitionOfSuccess;
	String log;
	
	String indexTextFile;
	
	public Hypergeometric(double ex, double nn, double m, double n, double k, String definitionOfSuccess)
	{
		this.ex = ex;
		this.nn = nn;
		this.m= m;
		this.n=n;
		this.k = k;
		this.definitionOfSuccess = definitionOfSuccess;
		log = "Hypergeometric Distribution \r\n\r\n"; // for the text file
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
            //R execution
            REXP x;
            x = connection.eval("rhyper("+nn+","+m+","+n+","+k+")");
            int[] results = x.asIntegers();
            
            log += "nn = " + nn + "\r\nm = " + m + "\r\nn = " + n + "\r\nk = " + k + "\r\ndefinition of success = " + definitionOfSuccess + "\r\n";
            
            //Averaging the actual results
            double average=0;
            for (int i = 0; i < results.length; i++) 
            {
                //Displaying experiment results
            	log += "Experiment #"+i+" result: "+results[i]+" successes"+"\r\n";
                average += results[i];
             }
            average = average/results.length;
            log += "The average successes is "+average+"\r\n";
            
            //Actual and Ideal Probabilities
            double actual = 1-(average/(m+n));
            log += "The actual probability is "+actual+"\r\n";
            x = connection.eval("phyper("+ex+","+m+","+n+","+k+")");
            double ideal = x.asDouble();
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
    		rCode = "y<- "+"rhyper("+nn+","+m+","+n+","+k+")";
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
    		rCode = "x<- "+"dhyper(0:"+nn+","+m+","+n+","+k+")";
    		connection.eval(rCode);
    		rCode = "png(filename = \""+indexTextFile+"-Ideal.png\")";
    		connection.eval(rCode);
    		rCode = "barplot(table(x))";
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
