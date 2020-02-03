package net.talaatharb.projecteuler100;

import java.util.HashMap;
import java.util.Map;

/**
 * P014
 * 
 * @author mharb
 *
 */
public class P014 implements Runnable {

	private final Map<Long, Long> memoryCache;

	private static final double NANO_TO_S = 1000000000.0;

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

	/**
	 * Public constructor
	 */
	public P014() {
		memoryCache = new HashMap<>();
		memoryCache.put(1L, 0L);
	}

	/**
	 * Problem solution entry point
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		new P014().run();
	}

	@Override
	public void run() {
		final long startTime = System.nanoTime();
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
		final double totalTime = (System.nanoTime() - startTime) / NANO_TO_S;
		System.out.println("p014: " + maxNumber + " -> " + totalTime + " s");
	}

}
