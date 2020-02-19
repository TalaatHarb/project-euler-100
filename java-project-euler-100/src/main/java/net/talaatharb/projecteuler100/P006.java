package net.talaatharb.projecteuler100;

/**
 * P006
 * 
 * @author mharb
 *
 */
public class P006 extends Solution {

	/**
	 * Problem solution entry point
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		new P006().run();
	}

	@Override
	public Number solve() {
		problemNumber = 6;
		int result = 0;
		int last = 100;
		int sum = 0;
		int sumOfSquares = 0;

		for (int i = 1; i < last + 1; i++) {
			sum += i;
			sumOfSquares += (i * i);
		}
		result = (sum * sum) - sumOfSquares;

		return result;
	}

}
