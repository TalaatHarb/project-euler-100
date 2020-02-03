package net.talaatharb.projecteuler100;

import java.util.ArrayList;
import java.util.List;

/**
 * P010
 * 
 * @author mharb
 *
 */
public class P010 implements Runnable {

	private static final double NANO_TO_S = 1000000000.0;

	/**
	 * Problem solution entry point
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		new P010().run();
	}

	private static final List<Integer> sieveOfEratosthenes(final int n) {
		/**
		 * Create a boolean array "notPrime[0..n]" and initialize all entries in it as
		 * false. A value in notPrime[i] will finally be true if i is not a prime, else
		 * false.
		 */
		boolean[] notPrime = new boolean[n];

		int p = 2;
		while (p * p <= n) {

			// If notPrime[p] is not changed, then it is a notPrime
			if (!notPrime[p]) {
				// Update all multiples of p
				for (int i = (p * 2); i < n; i += p) {
					notPrime[i] = true;
				}
			}
			p += 1;
		}
		notPrime[0] = true;
		notPrime[1] = true;

		final List<Integer> listOfPrimes = new ArrayList<>();
		for (int i = 0; i < n; i++) {
			if (!notPrime[i]) {
				listOfPrimes.add(i);
			}
		}

		return listOfPrimes;
	}

	@Override
	public void run() {
		final long startTime = System.nanoTime();
		final int last = 2000000;
		long sum = 0;
		final List<Integer> listOfPrimes = sieveOfEratosthenes(last);
		for (int i : listOfPrimes) {
			sum += i;
		}
		final double totalTime = (System.nanoTime() - startTime) / NANO_TO_S;
		System.out.println("p010: " + sum + " -> " + totalTime + " s");
	}

}
