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
	
	public NegativeBinomial(double k, double size, double prob, String definitionOfSuccess)
	{
		this.k = k;
		this.size = size;
		this.prob = prob;
		this.definitionOfSuccess = definitionOfSuccess;
	}
	
	public void execute()
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
            
            
            //Averaging the actual results
            double average=0;
            for (int i = 0; i < results.length; i++) {
                //Displaying experiment results
            	System.out.println("Experiment #"+i+" result: "+results[i]+" failures");
                average+=results[i];
             }
            average = average/results.length;
            System.out.println("The average failures is "+average);
            //Actual and Ideal Probabilities
            double actual = 1-(average/(average+size));
            System.out.println("The actual probability is "+actual);
            double ideal = prob;
            System.out.println("The ideal probability is "+ideal);
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
	}

}
