package net.talaatharb.projecteuler100;

/**
 * @author mharb
 *
 */
public class P002 implements Runnable {

	private static final double NANO_TO_S = 1000000000.0;

	/**
	 * Problem solution entry point
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		new P002().run();
	}

	@Override
	public void run() {
		final long startTime = System.nanoTime();
		long max = 4000000;
		int previous = 1;
		int current = 2;
		int sum = current;
		while (current < max) {
			int next = previous + current;
			if ((next < max) && (next % 2 == 0)) {
				sum += next;
			}
			previous = current;
			current = next;
		}

		final double period = (System.nanoTime() - startTime) / NANO_TO_S;
		System.out.println("p002: " + sum + " -> " + period + " s");
	}

}
