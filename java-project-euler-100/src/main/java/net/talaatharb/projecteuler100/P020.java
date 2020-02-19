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
public class P020 extends Solution {

	/**
	 * Problem solution entry point
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		new P020().run();
	}

	private final Map<Integer, BigInteger> memoryCache;

	/**
	 * Public constructor
	 */
	public P020() {
		memoryCache = new HashMap<>();
		memoryCache.put(0, BigInteger.valueOf(1));
	}

	private int digitSum(final String string) {
		int result = 0;
		final char[] digits = string.toCharArray();
		for (char i : digits) {
			result += Character.getNumericValue(i);
		}

		return result;
	}

	private BigInteger factorial(final int n) {
		if (memoryCache.containsKey(n)) {
			return memoryCache.get(n);
		}
		final BigInteger data = BigInteger.valueOf(n).multiply(factorial(n - 1));
		memoryCache.put(n, data);
		return data;
	}

	@Override
	public Number solve() {
		problemNumber = 20;
		final int n = 100;

		for (int i = 1; i < n; i++) {
			factorial(i);
		}

		return digitSum(factorial(n).toString());
	}

}
