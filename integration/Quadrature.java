package integration;
/*************************************************************************
 *  Compilation:  javac AdaptiveQuadrature.java
 *  Execution:    java AdaptiveQuadrature a b
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
	        
	        double Q1 = h/6  * (f.fun(a) + 4*f.fun(c) + f.fun(b));
	        double Q2 = h/12 * (f.fun(a) + 4*f.fun(d) + 2*f.fun(c) + 4*f.fun(e) + f.fun(b));
	        
	        if (Math.abs(Q2 - Q1) <= EPSILON)
	            return Q2 + (Q2 - Q1) / 15;
	        else
	            return adaptive(a, c, f) + adaptive(c, b, f);
	    }
}
