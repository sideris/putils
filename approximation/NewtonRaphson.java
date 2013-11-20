package approximation;

import integration.Function;

public class NewtonRaphson {
	
	public double NR(double initial, double threshold, Function f, Function deriv){
		double now = initial;
		double next, tmp;

		if( initial == 0) return 0;
		
		do{
			tmp = now;
			next = now - ( f.fun(now) / deriv.fun(now) );
			now = next;
		}while( Math.abs(now - tmp) >= threshold );
		
		return now;
	}
	
}
