package net.talaatharb.projecteuler100;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * P005
 * 
 * @author mharb
 *
 */
public class P005  extends Solution {

	/**
	 * Problem solution entry point
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		new P005().run();
	}

	@Override
	public Number solve() {
		problemNumber = 5;
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
		
		return result;
	}

}
