package net.talaatharb.projecteuler100;

/**
 * P003
 * 
 * @author mharb
 *
 */
public class P003 extends Solution {

	private static final boolean isPrime(final long number) {
		if (number % 2 == 0) {
			return false;
		}
		double upperLimit = Math.floor(Math.sqrt(number));
		if (upperLimit % 2 == 0) {
			upperLimit--;
		}
		for (int i = (int) upperLimit; i > 1; i -= 2) {
			if (number % i == 0) {
				return false;
			}
		}
		return true;
	}

	/**
	 * Problem solution entry point
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		new P003().run();
	}

	@Override
	public Number solve() {
		problemNumber = 3;
		final long number = 600851475143L;

		double upperLimit = Math.floor(Math.sqrt(number));
		if (upperLimit % 2 == 0) {
			upperLimit--;
		}
		long possibleFactor = (long) upperLimit;
		long result = number;
		while (possibleFactor > 1) {
			if ((number % possibleFactor == 0) && isPrime(possibleFactor)) {
				result = possibleFactor;
				break;
			}
			possibleFactor -= 2;
		}
		return result;
	}

}
