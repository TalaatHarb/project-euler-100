package net.talaatharb.projecteuler100;

import java.math.BigInteger;

/**
 * P016
 * 
 * @author mharb
 *
 */
public class P016 implements Runnable {

	private static final double NANO_TO_S = 1000000000.0;

	/**
	 * Problem solution entry point
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		new P016().run();
	}

	@Override
	public void run() {
		final long startTime = System.nanoTime();
		int result = 0;
		final int n = 1000;
		final BigInteger number = BigInteger.valueOf(2).pow(n);
		final String number_string = number.toString();
		for (char i : number_string.toCharArray()) {
			result += Character.getNumericValue(i);
		}
		final double totalTime = (System.nanoTime() - startTime) / NANO_TO_S;
		System.out.println("p016: " + result + " -> " + totalTime + " s");
	}

}
