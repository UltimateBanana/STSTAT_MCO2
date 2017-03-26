package controller;

import model.Binomial;
import model.Hypergeometric;
import model.Multinomial;
import model.NegativeBinomial;
import model.WriteFile;

public class Controller {

	Binomial binomial;
	NegativeBinomial negativeBinomial;
	Hypergeometric hypergeometric;
	Multinomial multinomial;
	WriteFile fileWriter;
	
	int indexTextFile;
	String log;
	
	public Controller(){
		log = "";
		indexTextFile = 1;
	}
	
	// Binomial
	public void getBinomial(double k, double size, double prob, String definitionOfSuccess)
	{
		// Call the Binomial method here
		binomial = new Binomial(k,size,prob,definitionOfSuccess);
		log = binomial.execute();
		System.out.println(log);
		System.out.println();
		
		fileWriter = new WriteFile(indexTextFile, log);
		fileWriter.write();
		indexTextFile++;
	}

	// Negative Binomial
	public void getNegativeBinomial(double k, double size, double prob, String definitionOfSuccess)
	{
		negativeBinomial = new NegativeBinomial(k,size,prob,definitionOfSuccess);
		log = negativeBinomial.execute();
		System.out.println(log);
		System.out.println();
		
		fileWriter = new WriteFile(indexTextFile, log);
		fileWriter.write();
		indexTextFile++;
	}
	
	// Hypergeometric
	public void getHypergeometric(double nn, double m, double n, double k, String definitionOfSuccess)
	{
		// parameter nn is k-experiments (based from specs)
		hypergeometric = new Hypergeometric(nn,m,n,k,definitionOfSuccess);
		log = hypergeometric.execute();
		System.out.println(log);
		System.out.println();
		
		fileWriter = new WriteFile(indexTextFile, log);
		fileWriter.write();
		indexTextFile++;
	}
	
	
	// Multinomial
	public void getMultinomial(double k, double size, double[] prob)
	{
		multinomial = new Multinomial(k,size,prob);
		log = multinomial.execute();
		System.out.println(log);
		System.out.println();
		
		fileWriter = new WriteFile(indexTextFile, log);
		fileWriter.write();
		indexTextFile++;
	}
	
}
