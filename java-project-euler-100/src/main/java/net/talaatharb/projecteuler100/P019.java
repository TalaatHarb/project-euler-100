package net.talaatharb.projecteuler100;

/**
 * P019
 * 
 * @author mharb
 *
 */
public class P019 implements Runnable {

	private static final double NANO_TO_S = 1000000000.0;

	/**
	 * Problem solution entry point
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		new P019().run();
	}

	@Override
	public void run() {
		final long startTime = System.nanoTime();
		int result = 0;
		
		final double totalTime = (System.nanoTime() - startTime) / NANO_TO_S;
		System.out.println("p019: " + result + " -> " + totalTime + " s");
	}

}
