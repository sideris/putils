package sideris.putils.math.approximation;

import sideris.putils.math.integration.Function;

public class NewtonRaphson {
	
	public double approximate(double initial, double threshold, Function f, Function deriv){
		double now = initial;
		double next, tmp;
		if( initial == 0) return 0;
		do {
			tmp = now;
			next = now - ( f.function(now) / deriv.function(now) );
			now = next;
		} while( Math.abs(now - tmp) >= threshold );
		return now;
	}
	
}
