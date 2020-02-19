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
public class P015 extends Solution {

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
	public Number solve() {
		problemNumber = 15;
		final int n = 20;

		for (int i = 1; i < (2 * n); i++) {
			factorial(i);
		}

		return factorial(2 * n).divide((factorial(n).multiply(factorial(n))));
	}

}
