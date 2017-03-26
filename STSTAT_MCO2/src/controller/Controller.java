package controller;

import model.Binomial;
import model.Hypergeometric;
import model.Multinomial;
import model.NegativeBinomial;

public class Controller {

	Binomial binomial;
	NegativeBinomial negativeBinomial;
	Hypergeometric hypergeometric;
	Multinomial multinomial;
	
	public Controller(){
		
	}
	
	// Binomial
	public void getBinomial(double k, double size, double prob, String definitionOfSuccess)
	{
		System.out.println("Binomial!");
		// Call the Binomial method here
		binomial = new Binomial(k,size,prob,definitionOfSuccess);
		System.out.println("created "+k+size+prob);
		binomial.execute();
		System.out.println();
	}

	// Negative Binomial
	public void getNegativeBinomial(double k, double size, double prob, String definitionOfSuccess)
	{
		System.out.println("NegativeBinomial!");
		negativeBinomial = new NegativeBinomial(k,size,prob,definitionOfSuccess);
		System.out.println("created "+k+size+prob);
		negativeBinomial.execute();
		System.out.println();
	}
	
	// Hypergeometric
	public void getHypergeometric(double nn, double m, double n, double k, String definitionOfSuccess)
	{
		// parameter nn is k-experiments (based from specs)
		System.out.println("Hypergeometric!");
		hypergeometric = new Hypergeometric(nn,m,n,k,definitionOfSuccess);
		System.out.println("created "+nn+m+n+k+definitionOfSuccess);
		hypergeometric.execute();
		System.out.println();
	}
	
	
	// Multinomial
	public void getMultinomial(double k, double size, double[] prob)
	{
		System.out.println("MultinomialCoins!");
		multinomial = new Multinomial(k,size,prob);
//		System.out.println("created "+k+size+prob[0]+prob[1]+prob[2]+prob[3]);
		multinomial.execute();
		System.out.println();
	}
	
}
