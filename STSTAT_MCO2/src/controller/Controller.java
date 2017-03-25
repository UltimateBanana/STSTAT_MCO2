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
	public void getBinomial(float k, float size, float prob, String definitionOfSuccess)
	{
		System.out.println("BinomialCoins!");
		// Call the Binomial method here
	}
	
	// Negative Binomial
	public void getNegativeBinomial(float k, float size, float prob, String definitionOfSuccess)
	{
		System.out.println("NegativeBinomialCoins!");
	}
	
	// Hypergeometric
	public void getHypergeometric(float nn, float m, float n, float k)
	{
		// parameter nn is k-experiments (based from specs)
		System.out.println("HypergeometricCoins!");
	}
	
	
	// Multinomial
	public void getMultinomial(float k, float size, float prob)
	{
		System.out.println("MultinomialCoins!");
	}
	
}
