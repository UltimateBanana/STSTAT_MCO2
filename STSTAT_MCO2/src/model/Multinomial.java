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
            
            connection.eval("p1="+prob[0]);
            connection.eval("p2="+prob[1]);
            connection.eval("p3="+prob[2]);
            connection.eval("p4="+prob[3]);
            String probability="c(p1,p2,p3,p4)";
            REXP x;
            x = connection.eval("rmultinom("+k+","+size+","+probability+")");
            double[][] results = x.asDoubleMatrix();
            //Averaging the actual results
            double average=0;
            for (int i = 0; i < 4; i++) {
                //Displaying experiment results
            	for (int j = 0; j < k; j++){
            	System.out.print(results[i][j]+" ");	
            	}//average+=results[i];
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
