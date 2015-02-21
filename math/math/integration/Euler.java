package math.integration;

public class Euler {
	public double euler(double initial, double cuttoff, double step, Function fun){
		double next, current = initial;
		next = current + cuttoff*10;
		double t = step;
		
		while( (next - current) > cuttoff ){
			current = next;
			next = current + step*fun.function(t);
			t+=step;
		}
		return next;
	}
}
