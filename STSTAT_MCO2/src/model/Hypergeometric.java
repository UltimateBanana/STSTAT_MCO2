package model;

import org.rosuda.REngine.REXP;
import org.rosuda.REngine.REXPMismatchException;
import org.rosuda.REngine.Rserve.RConnection;
import org.rosuda.REngine.Rserve.RserveException;

public class Hypergeometric {
	// Variables for the input
	double nn;
	double m;
	double n;
	double k;
	String definitionOfSuccess;
	
	public Hypergeometric(double nn, double m, double n, double k, String definitionOfSuccess)
	{
		
		this.nn = nn;
		this.m= m;
		this.n=n;
		this.k = k;
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
            x = connection.eval("rhyper("+nn+","+m+","+n+","+k+")");
            int[] results = x.asIntegers();
            
            //Averaging the actual results
            double average=0;
            for (int i = 0; i < results.length; i++) 
            {
                //Displaying experiment results
            	System.out.println("Experiment #"+i+" result: "+results[i]+" successes");
                average += results[i];
             }
            average = average/results.length;
            System.out.println("The average successes is "+average);
            
            //Actual and Ideal Probabilities
//            double actual = ;
//            System.out.println("The actual probability is "+actual);
            x = connection.eval("phyper("+nn+","+m+","+n+","+k+")");
            double ideal = x.asDouble();
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
