package net.talaatharb.projecteuler100;

/**
 * P009
 * 
 * @author mharb
 *
 */
public class P009 implements Runnable {

	private static final double NANO_TO_S = 100000000.0;

	/**
	 * Problem solution entry point
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		new P009().run();
	}

	@Override
	public void run() {
		final long startTime = System.nanoTime();
		final int target_sum = 1000;
		int product = 0;
		for (int a = 1; a < (target_sum - 2); a++) {
			for (int b = a + 1; b < (target_sum - 1); b++) {
				int sum_of_squares = a * a + b * b;
				double c = (Math.sqrt(sum_of_squares));
				double sum = a + b + c;
				if (sum == target_sum) {
					c = Math.floor(c);
					product = (int) (a * b * c);
				}
			}
		}

		final double totalTime = (System.nanoTime() - startTime) / NANO_TO_S;
		System.out.println("p009: " + product + " -> " + totalTime + " s");
	}

}
