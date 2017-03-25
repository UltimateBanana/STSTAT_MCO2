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
		System.out.println("BinomialCoins!");
		// Call the Binomial method here
	}
	
	// Negative Binomial
	public void getNegativeBinomial(double k, double size, double prob, String definitionOfSuccess)
	{
		System.out.println("NegativeBinomialCoins!");
	}
	
	// Hypergeometric
	public void getHypergeometric(double nn, double m, double n, double k, String definitionOfSuccess)
	{
		// parameter nn is k-experiments (based from specs)
		System.out.println("HypergeometricCoins!");
	}
	
	
	// Multinomial
	public void getMultinomial(double k, double size, double[] prob)
	{
		System.out.println("MultinomialCoins!");
	}
	
}
