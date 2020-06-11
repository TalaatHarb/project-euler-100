package net.talaatharb.projecteuler100;

/**
 * P009
 * 
 * @author mharb
 *
 */
public class P009 extends Solution {

	/**
	 * Problem solution entry point
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		new P009().run();
	}

	@Override
	public Number solve() {
		problemNumber = 9;
		final int targetSum = 1000;
		int product = 0;
		for (int a = 1; a < (targetSum - 2); a++) {
			for (int b = a + 1; b < (targetSum - 1); b++) {
				int sumOfSquares = a * a + b * b;
				double c = (Math.sqrt(sumOfSquares));
				double sum = a + b + c;
				if (sum == targetSum) {
					c = Math.floor(c);
					product = (int) (a * b * c);
				}
			}
		}

		return product;
	}

}
