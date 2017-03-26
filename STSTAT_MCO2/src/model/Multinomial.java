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
	
	public Multinomial(double k, double size, double[] prob)
	{
		this.k = k;
		this.size = size;
		this.prob = prob;
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
            		System.out.print(results[i][j] + " ");	
            	}
            	//average+=results[i];
            	System.out.println();
             }
            
            //average = average/results.length;
            System.out.println("The average successes of p1 is "+average);
            System.out.println("The average successes of p2 is "+average);
            System.out.println("The average successes of p3 is "+average);
            System.out.println("The average successes of p4 is "+average);
            
            //Actual and Ideal Probabilities
            //double actual = ?;
            //System.out.println("The actual probability is "+actual);
            //double ideal = ?;
            //System.out.println("The ideal probability is "+ideal);
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
