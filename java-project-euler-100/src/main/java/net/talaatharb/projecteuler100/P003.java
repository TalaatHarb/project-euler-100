package net.talaatharb.projecteuler100;

/**
 * P003
 * 
 * @author mharb
 *
 */
public class P003 implements Runnable {

	private static final double NANO_TO_S = 1000000000.0;

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
	public void run() {
		final long startTime = System.nanoTime();
		long number = 600851475143L;

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
		final double totalTime = (System.nanoTime() - startTime) / NANO_TO_S;
		System.out.println("p003: " + result + " -> " + totalTime + " s");
	}

}
