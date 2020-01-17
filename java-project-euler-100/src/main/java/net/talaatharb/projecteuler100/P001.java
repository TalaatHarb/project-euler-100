package net.talaatharb.projecteuler100;

/**
 * @author mharb
 *
 */
public class P001 implements Runnable {

	private static final double NANO_TO_S = 100000000.0;

	/**
	 * Problem solution entry point
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		new P001().run();
	}

	@Override
	public void run() {
		final long startTime = System.nanoTime();
		final int last = 1000;
		int sum = 0;

		for (int i = 1; i < last; i++) {
			if ((i % 3 == 0) || (i % 5 == 0)) {
				sum = sum + i;
			}
		}

		final double period = (System.nanoTime() - startTime) / NANO_TO_S;
		System.out.println("p001: " + sum + " -> " + period + " s");
	}

}
