package net.talaatharb.projecteuler100;

import java.math.BigInteger;
import java.util.HashMap;
import java.util.Map;

/**
 * P020
 * 
 * @author mharb
 *
 */
public class P020 implements Runnable {

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

	private int digitSum(final String string) {
		int result = 0;
		final char[] digits = string.toCharArray();
		for (char i : digits) {
			result += Character.getNumericValue(i);
		}

		return result;
	}

	/**
	 * Public constructor
	 */
	public P020() {
		memoryCache = new HashMap<>();
		memoryCache.put(0, BigInteger.valueOf(1));
	}

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

		final int n = 100;

		for (int i = 1; i < n; i++) {
			factorial(i);
		}

		result = digitSum(factorial(n).toString());

		final double totalTime = (System.nanoTime() - startTime) / NANO_TO_S;
		System.out.println("p020: " + result + " -> " + totalTime + " s");
	}

}
