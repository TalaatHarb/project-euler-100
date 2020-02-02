package net.talaatharb.projecteuler100;

/**
 * P006
 * 
 * @author mharb
 *
 */
public class P006 implements Runnable {

	private static final double NANO_TO_S = 100000000.0;

	/**
	 * Problem solution entry point
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		new P006().run();
	}

	@Override
	public void run() {
		final long startTime = System.nanoTime();
		int result = 0;
		int last = 100;
		int sum = 0;
		int sumOfSquares = 0;

		for (int i = 1; i < last + 1; i++) {
			sum += i;
			sumOfSquares += (i * i);
		}
		result = (sum * sum) - sumOfSquares;

		final double totalTime = (System.nanoTime() - startTime) / NANO_TO_S;
		System.out.println("p006: " + result + " -> " + totalTime + " s");
	}

}
