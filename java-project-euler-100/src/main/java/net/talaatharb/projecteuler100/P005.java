package net.talaatharb.projecteuler100;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class P005 implements Runnable {

	private static final double NANO_TO_S = 100000000.0;

	/**
	 * Problem solution entry point
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		new P005().run();
	}

	@Override
	public void run() {
		long startTime = System.nanoTime();
		final int last = 20;
		final List<Integer> sequence = new ArrayList<>();
		int result = 1;
		int number = 2;
		int counter = number;
		while (counter <= last) {
			for (Iterator<Integer> iterator = sequence.iterator(); iterator.hasNext();) {
				int i = iterator.next();
				if (number % i == 0) {
					number /= i;
				}
			}

			result *= number;
			sequence.add(number);
			counter += 1;
			number = counter;
		}
		double totalTime = (System.nanoTime() - startTime) / NANO_TO_S;
		System.out.println("p005: " + result + " -> " + totalTime + " s");

	}

}
