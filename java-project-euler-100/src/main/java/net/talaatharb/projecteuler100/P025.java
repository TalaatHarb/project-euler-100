package net.talaatharb.projecteuler100;

import java.math.BigInteger;
import java.util.HashMap;
import java.util.Map;

/**
 * P025
 * 
 * @author mharb
 *
 */
public class P025 extends Solution {

	/**
	 * Problem solution entry point
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		new P025().run();
	}

	private Map<Integer, BigInteger> memoryCache;

	public P025() {
		memoryCache = new HashMap<>();

		memoryCache.put(1, BigInteger.valueOf(1));
		memoryCache.put(2, BigInteger.valueOf(1));
	}

	BigInteger fib(final int n) {
		if (memoryCache.containsKey(n)) {
			return memoryCache.get(n);
		}

		final BigInteger result = fib(n - 2).add(fib(n - 1));
		memoryCache.put(n, result);

		return result;
	}

	@Override
	public Number solve() {
		problemNumber = 25;
		final int n = 1000;

		int i = 3;
		BigInteger a = fib(i);
		while (("" + a).length() < n) {
			i++;
			a = fib(i);
		}

		return i;
	}

}
