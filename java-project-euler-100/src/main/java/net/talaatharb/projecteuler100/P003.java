package net.talaatharb.projecteuler100;

public class P003 implements Runnable {

	private static final double NANO_TO_S = 100000000.0;

	/**
	 * Problem solution entry point
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		new P003().run();
	}

	@Override
	public void run() {
		long startTime = System.nanoTime();
		long maxPrime = -1;
		long n = 600851475143L;

		while (n % 2 == 0) {
			maxPrime = 2;

			// equivalent to n /= 2
			n >>= 1;
		}

		for (int i = 3; i <= Math.sqrt(n); i += 2) {
			while (n % i == 0) {
				maxPrime = i;
				n = n / i;
			}
		}
		if (n > 2) {
			maxPrime = n;
		}
		double totalTime = (System.nanoTime() - startTime) / NANO_TO_S;
		System.out.println("p003: " + maxPrime + " -> " + totalTime + " s");
	}

}
