package model;

import umontreal.iro.lecuyer.probdist.BinomialDist;
import umontreal.iro.lecuyer.probdist.HypergeometricDist;
import umontreal.iro.lecuyer.probdist.NegativeBinomialDist;
import umontreal.iro.lecuyer.probdistmulti.MultinomialDist;

public class Testing {

	int nTrials;
	float p; // probability of success
	float q; // probability of failure
	int x ; // The binomial random variable, x, is the number of success in n trials
	String defSuccess; // definition of success
	
	
	public static void main(String[] args)
	{
		BinomialDist binomial = new BinomialDist(20, 0.5); // parameters: n, p
		System.out.println("Binomial Distribution: " + binomial.prob(5)); // parameter: x
		
		NegativeBinomialDist negativeBinomial = new NegativeBinomialDist(2, 0.5); // parameters: r, p
		System.out.println("Negative Binomial Distribution: " + negativeBinomial.prob(3)); // parameter: x
		
		HypergeometricDist hypergeom = new HypergeometricDist(5, 10, 2); // parameters: k, N, n
		System.out.println("Hypergeometric Distribution: " + hypergeom.prob(1)); // parameter: x
		
		double[] p = {0.25, 0.25, 0.25, 0.25};
		int[] n = {1, 1, 1, 2};
		MultinomialDist multinomial = new MultinomialDist(5, p); // parameters: n, p[]
		System.out.println("Multinomial Distribution: " + multinomial.prob(n)); // parameter: n[]
		
	}
	
}
