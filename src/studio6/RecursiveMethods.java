package studio6;

import edu.princeton.cs.introcs.StdDraw;

public class RecursiveMethods {

	/**
	 * Computes the geometric sum for the first n terms in the series
	 * 
	 * @param n the number of terms to include in the sum
	 * @return the sum of the first n terms of the geometric series (1/2 + 1/4 + 1/8
	 *         ...)
	 */
	public static double geometricSum(int n) {
		double value = Math.pow(0.5, n);
		if (n == 0) {
			return 0;
		}
		else {
			return value + geometricSum(n-1);
		}
	}

	/**
	 * This method uses recursion to compute the greatest common divisor
	 * for the two input values
	 * 
	 * @param p first operand
	 * @param q second operand
	 * @return greatest common divisor of p and q
	 */
	public static int gcd(int p, int q) {
		
			// FIXME compute the gcd of p and q using recursion
			return 0;
		
	}

	

	/**
	 * This method uses recursion to create a reverse of the given array
	 * 
	 * @param array the array to create a reverse of, not to be mutated
	 * @return an array with the same data as the input but it reverse order
	 */
	public static int[] toReversed(int[] array) {
		int[] reversed = new int[array.length];
		for (int i = 0; i < array.length; i++) {
			reversed[i] = array[i];
		}
		if(array.length <= 1){
			return reversed;
		}
		else {
			// FIXME create a helper method that can recursively reverse the given array
			return reverse(reversed, reversed.length/2-1);
		}
	}

	public static int[] reverse(int[] array, int index) {
		if (index < 0) {
			return array;
		}
		else {
			int temp1 = array[index];
			int temp2 = array[array.length-index-1];
			array[index] = temp2;	
			array[array.length-index-1] = temp1;
			return reverse(array, index-1);
		}
	}
	public static void main(String[] args) {
		int[] test = {0, 3, 4, 5, 8, 9, 7};
		int[] result = toReversed(test);
		for (int num: result) {
			System.out.print(num + " ");
		}
		for (int num: test) {
			System.out.print(num + " ");
		}
	}
	
	/**
	 * @param xCenter                       x-coordinate of the center of the circle
	 *                                      at the current depth
	 * @param yCenter                       y-coordinate of the center of the circle
	 *                                      at the current depth
	 * @param radius                        radius of the circle at the current
	 *                                      depth
	 * @param radiusMinimumDrawingThreshold radius above which drawing should occur
	 */
	public static void circlesUponCircles(double xCenter, double yCenter, double radius,
			double radiusMinimumDrawingThreshold) {
		if (radius <= radiusMinimumDrawingThreshold) {
			
		}
		else {
			StdDraw.circle(xCenter, yCenter, radius);
			circlesUponCircles(xCenter-radius, yCenter, radius/3, radiusMinimumDrawingThreshold);
			circlesUponCircles(xCenter+radius, yCenter, radius/3, radiusMinimumDrawingThreshold);
			circlesUponCircles(xCenter, yCenter-radius, radius/3, radiusMinimumDrawingThreshold);
			circlesUponCircles(xCenter, yCenter+radius, radius/3, radiusMinimumDrawingThreshold);
		}
		// FIXME
	}

}
