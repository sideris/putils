package math.integration;
/*************************************************************************
 * 
 *  Numerically integrate the function in the interval [a, b].
 *	http://introcs.cs.princeton.edu/java/93integration/AdaptiveQuadrature.java
 *
 *************************************************************************/
public class Quadrature {
	
	 private final static double EPSILON = 1E-6;
	    // adaptive quadrature
	    public double adaptive(double a, double b, Function f) {
	        double h = b - a;
	        double c = (a + b) / 2.0;
	        double d = (a + c) / 2.0;
	        double e = (b + c) / 2.0;
	        
	        double Q1 = h/6  * (f.function(a) + 4*f.function(c) + f.function(b));
	        double Q2 = h/12 * (f.function(a) + 4*f.function(d) + 2*f.function(c) + 4*f.function(e) + f.function(b));
	        
	        if (Math.abs(Q2 - Q1) <= EPSILON)
	            return Q2 + (Q2 - Q1) / 15;
	        else
	            return adaptive(a, c, f) + adaptive(c, b, f);
	    }
}
