package integration;

public class Simpsons {
	  
	public static double simpsons(double a, double b, int n, Function f){
		    double range = checkParamsGetRange(a, b, n);
		    double nFloat = (double)n;
		    double sum1 = f.fun(a + range / (nFloat * 2.0)), sum2 = 0.0;
		    
		    for (int i = 1; i < n; i++){
		      double x1 = a + range * ((double)i + 0.5) / nFloat;
		      sum1 += f.fun(x1);
		      double x2 = a + range * (double)i / nFloat;
		      sum2 += f.fun(x2);
		    }
		    
		    return (f.fun(a) + f.fun(b) + sum1 * 4.0 + sum2 * 2.0) * range / (nFloat * 6.0);
	  }
	  
	  private static double checkParamsGetRange(double a, double b, int n){
		    if (n <= 0) throw new IllegalArgumentException("Invalid value of n");
		    double range = b - a;
		    if (range <= 0) throw new IllegalArgumentException("Invalid range");
		    return range;
	  }
}
