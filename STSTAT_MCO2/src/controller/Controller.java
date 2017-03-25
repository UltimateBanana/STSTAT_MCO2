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
	public void getBinomialCoins(float x, float size, float prob, String definitionOfSuccess)
	{
		System.out.println("BinomialCoins!");
		// Call the Binomial method here
	}
	
	public void getBinomialCards(float x, float size, float prob, String definitionOfSuccess)
	{
		System.out.println("BinomialCards!");
		// Call the Binomial method here
	}
	
	public void getBinomialMarbles(float x, float size, float prob, String definitionOfSuccess)
	{
		System.out.println("BinomialMarbles!");
		// Call the Binomial method here
	}
	
	// Negative Binomial
	public void getNegativeBinomialCoins()
	{
		System.out.println("NegativeBinomialCoins!");
	}
	
	public void getNegativeBinomialCards()
	{
		System.out.println("NegativeBinomialCards!");
	}
	
	public void getNegativeBinomialMarbles()
	{
		System.out.println("NegativeBinomialMarbles!");
	}
	
	// Hypergeometric
	public void getHypergeometricCoins()
	{
		System.out.println("HypergeometricCoins!");
	}
	
	public void getHypergeometricCards()
	{
		System.out.println("HypergeometricCards!");
	}
	
	public void getHypergeometricMarbles()
	{
		System.out.println("HypergeometricMarbles!");
	}
	
	// Multinomial
	public void getMultinomialCoins()
	{
		System.out.println("MultinomialCoins!");
	}
	
	public void getMultinomialCards()
	{
		System.out.println("MultinomialCards!");
	}
	
	public void getMultinomialMarbles()
	{
		System.out.println("MultinomialMarbles!");
	}
}
