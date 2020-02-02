package net.talaatharb.projecteuler100;

/**
 * P007
 * 
 * @author mharb
 *
 */
public class P007 implements Runnable {

	private static final double NANO_TO_S = 100000000.0;

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
		new P007().run();
	}

	@Override
	public void run() {
		final long startTime = System.nanoTime();
		final int target = 10001;
		int counter = 1;
		int current = 0;

		int i = 1;
		while (counter <= target) {
			if (isPrime(i)) {
				current = i;
				counter += 1;
			}
			i += 2;
		}

		final double totalTime = (System.nanoTime() - startTime) / NANO_TO_S;
		System.out.println("p007: " + current + " -> " + totalTime + " s");
	}

}
