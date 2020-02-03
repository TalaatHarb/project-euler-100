package net.talaatharb.projecteuler100;

/**
 * P018
 * 
 * @author mharb
 *
 */
public class P018 implements Runnable {

	private static final double NANO_TO_S = 1000000000.0;

	/**
	 * Problem solution entry point
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		new P018().run();
	}

	@Override
	public void run() {
		final long startTime = System.nanoTime();
		int result = 0;
		
		final double totalTime = (System.nanoTime() - startTime) / NANO_TO_S;
		System.out.println("p018: " + result + " -> " + totalTime + " s");
	}

}
