package net.talaatharb.projecteuler100;

import java.math.BigInteger;
import java.util.HashMap;
import java.util.Map;

/**
 * P015
 * 
 * @author mharb
 *
 */
public class P015 implements Runnable {

	private static final double NANO_TO_S = 1000000000.0;

	private final Map<Integer, BigInteger> memoryCache;

	private BigInteger factorial(final int n) {
		if (memoryCache.containsKey(n)) {
			return memoryCache.get(n);
		}
		final BigInteger data = BigInteger.valueOf(n).multiply(factorial(n - 1));
		memoryCache.put(n, data);
		return data;
	}

	/**
	 * Public constructor
	 */
	public P015() {
		memoryCache = new HashMap<>();
		memoryCache.put(0, BigInteger.valueOf(1));
	}

	/**
	 * Problem solution entry point
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		new P015().run();
	}

	@Override
	public void run() {
		final long startTime = System.nanoTime();
		int n = 20;

		for (int i = 1; i < (2 * n); i++) {
			factorial(i);
		}
		final BigInteger result = factorial(2 * n).divide((factorial(n).multiply(factorial(n))));

		final double totalTime = (System.nanoTime() - startTime) / NANO_TO_S;
		System.out.println("p015: " + result.toString() + " -> " + totalTime + " s");
	}

}
