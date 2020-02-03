package net.talaatharb.projecteuler100;

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

	private final Map<Integer, Long> memoryCache;

	private long factorial(final int n) {
		System.out.println(memoryCache);
		if (memoryCache.containsKey(n)) {
			return memoryCache.get(n);
		}
		final long data = n * factorial(n - 1);
		memoryCache.put(n, data);
		return data;
	}

	/**
	 * Public constructor
	 */
	public P015() {
		memoryCache = new HashMap<>();
		memoryCache.put(0, 1L);
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
		long result = 0;
		int n = 20;

		for (int i = 1; i < (2 * n); i++) {
			factorial(i);
		}
		result = factorial(2 * n) / (factorial(n) * factorial(n));

		final double totalTime = (System.nanoTime() - startTime) / NANO_TO_S;
		System.out.println("p015: " + result + " -> " + totalTime + " s");
	}

}
