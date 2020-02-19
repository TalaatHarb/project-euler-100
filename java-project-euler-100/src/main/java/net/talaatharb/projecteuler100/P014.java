package net.talaatharb.projecteuler100;

import java.util.HashMap;
import java.util.Map;

/**
 * P014
 * 
 * @author mharb
 *
 */
public class P014 extends Solution {

	/**
	 * Problem solution entry point
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		new P014().run();
	}

	private final Map<Long, Long> memoryCache;

	/**
	 * Public constructor
	 */
	public P014() {
		memoryCache = new HashMap<>();
		memoryCache.put(1L, 0L);
	}

	private long collatz(final long number) {

		if (memoryCache.containsKey(number)) {
			return memoryCache.get(number);
		}

		if (number % 2 == 0) {
			final long data = collatz(number / 2) + 1;
			memoryCache.put(number, data);
			return data;
		} else {
			final long data = collatz(3 * number + 1) + 1;
			memoryCache.put(number, data);
			return data;
		}
	}

	@Override
	public Number solve() {
		problemNumber = 14;
		long maxNumber = 1;
		long maxLength = 0;
		final int last = 1000000;

		for (long i = 2; i < last; i++) {
			final long sequenceLength = collatz(i);
			if (sequenceLength > maxLength) {
				maxLength = sequenceLength;
				maxNumber = i;
			}
		}

		return maxNumber;
	}

}
