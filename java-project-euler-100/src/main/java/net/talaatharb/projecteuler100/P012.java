package net.talaatharb.projecteuler100;

import java.util.ArrayList;
import java.util.List;

/**
 * P012
 * 
 * @author mharb
 *
 */
public class P012 implements Runnable {

	private static final double NANO_TO_S = 1000000000.0;

	private static final List<Long> sieveOfEratosthenes(final int n) {
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

		final List<Long> listOfPrimes = new ArrayList<>();
		for (int i = 0; i < n; i++) {
			if (!notPrime[i]) {
				listOfPrimes.add((long) i);
			}
		}

		return listOfPrimes;
	}

	private static final long triangularNumber(final long n) {
		return (n * (n + 1) / 2);
	}

	private static final int numberOfDivisors(long n, final List<Long> primes) {
		int result = 1;
		if (primes.contains(n)) {
			result = 2;
			return result;
		}
		for (long i : primes) {
			long num = 0;
			while (n % i == 0) {
				num += 1;
				n /= i;
			}

			if (num > 0) {
				result *= (num + 1);
			}
			if (i > n) {
				break;
			}
		}
		return result;
	}

	/**
	 * Problem solution entry point
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		new P012().run();
	}

	@Override
	public void run() {
		final long startTime = System.nanoTime();
		long result = 1;
		final int max = 100000;
		final int target = 500;
		List<Long> primes = sieveOfEratosthenes(max);
		int i = 1;
		while (result == 1) {
			final long tn = triangularNumber(i);
			final int n = numberOfDivisors(tn, primes);
			if (n > target) {
				result = tn;
			}
			i += 1;
		}
		final double totalTime = (System.nanoTime() - startTime) / NANO_TO_S;
		System.out.println("p012: " + result + " -> " + totalTime + " s");
	}

}
