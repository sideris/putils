package math.integration;
/**
 * http://fab.cba.mit.edu/classes/MAS.864/people/rachelle.villalon/pset4/rungeKuttaRV.java
 * **/
public class RungeKutta {
		// The number of steps to use in the interval
		public static final double STEPS = 100 * Math.PI;

		static double stiffness = 1;
		static double damping = -0.005;
		
		public double RK4(Function f) {

			final double amplitude = 5.0; // Max. amplititude for the oscillator									
			double h = 1.0 / STEPS; // timestep
			double k1x, k2x, k3x, k4x;  // Runge-Kutta coefficients for position.
			double k1y, k2y, k3y, k4y; // Runge-Kutta coefficients for velocity.
			double x, y; // position (x) and velocity (y) of the oscillator
			int i;
			double timeCurr; // time elapsed
			double sumError = 0;

			// Computation by 4th order Runge-Kutta
			// Initialize y (initial conditions)
			y = 0.0;
			x = amplitude; 
			timeCurr = 0.0; 
			for (i = 0; i < STEPS; i++) {
				// Step through, updating x
				 x= i * h;
				// Computing all of the trial values
				// calculating coefficients with the Runge-Kutte 4th order

				k1y = h * f.function(timeCurr, x, y);
				k1x = y * h;

				k2y = h * f.function(timeCurr, x + h / 2, y + k1x / 2);
				k2x = h * (y + k1y / 2);

				k3y = h * f.function(timeCurr, x + h / 2, y + k2x / 2);
				k3x = h * (k2y / 2);

				k4y = h * f.function(timeCurr, x + h, y + k3x);
				k4x = h * (y + k3x);
				// Incrementing x and y.Calc new position and velocity values
				y += k1y / 6 + k2y / 3 + k3y / 3 + k4y / 6;
				x += k1x / 6 + k2x / 3 + k3x / 3 + k4x / 6;
				timeCurr += h;
				sumError += 0;
			}
			return y;
		}
}
