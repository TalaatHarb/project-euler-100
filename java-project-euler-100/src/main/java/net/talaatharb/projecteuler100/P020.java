package net.talaatharb.projecteuler100;

/**
 * P020
 * 
 * @author mharb
 *
 */
public class P020 implements Runnable {

	private static final double NANO_TO_S = 1000000000.0;

	/**
	 * Problem solution entry point
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		new P020().run();
	}

	@Override
	public void run() {
		final long startTime = System.nanoTime();
		int result = 0;
		
		final double totalTime = (System.nanoTime() - startTime) / NANO_TO_S;
		System.out.println("p020: " + result + " -> " + totalTime + " s");
	}

}
