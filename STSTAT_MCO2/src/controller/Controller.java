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
	
	String indexTextFile;
	String log;
	
	public Controller(){
		log = "";
		indexTextFile = "";
	}
	
	// Binomial
	public void getBinomial(double k, double size, double prob, String definitionOfSuccess)
	{
		// Call the Binomial method here
		binomial = new Binomial(k,size,prob,definitionOfSuccess);
		log = binomial.execute();
		System.out.println(log);
		System.out.println();
		
		fileWriter = new WriteFile(log);
		indexTextFile = fileWriter.write();
		binomial.createGraphs(indexTextFile);
		
	}

	// Negative Binomial
	public void getNegativeBinomial(double k, double size, double prob, String definitionOfSuccess)
	{
		negativeBinomial = new NegativeBinomial(k,size,prob,definitionOfSuccess);
		log = negativeBinomial.execute();
		System.out.println(log);
		System.out.println();
		
		fileWriter = new WriteFile(log);
		indexTextFile = fileWriter.write();
		negativeBinomial.createGraphs(indexTextFile);
	}
	
	// Hypergeometric
	public void getHypergeometric(double x, double nn, double m, double n, double k, String definitionOfSuccess)
	{
		// parameter nn is k-experiments (based from specs)
		hypergeometric = new Hypergeometric(x, nn,m,n,k,definitionOfSuccess);
		log = hypergeometric.execute();
		System.out.println(log);
		System.out.println();
		
		fileWriter = new WriteFile(log);
		indexTextFile = fileWriter.write();
		hypergeometric.createGraphs(indexTextFile);
	}
	
	
	// Multinomial
	public void getMultinomial(double k, double size, double[] prob, double[] probSelected)
	{
		multinomial = new Multinomial(k,size,prob, probSelected);
		log = multinomial.execute();
		System.out.println(log);
		System.out.println();
		
		fileWriter = new WriteFile(log);
		indexTextFile = fileWriter.write();
		multinomial.createGraphs(indexTextFile);
	}
	
}
