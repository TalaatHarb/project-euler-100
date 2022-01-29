package net.talaatharb.projecteuler100;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * P023
 * 
 * @author mharb
 *
 */
public class P023 extends Solution {

	/**
	 * Problem solution entry point
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		new P023().run();
	}

	private Map<Integer, List<Integer>> divisorCashe;

	public P023() {
		divisorCashe = new HashMap<>();

		divisorCashe.put(2, Arrays.asList(1));
		divisorCashe.put(3, Arrays.asList(1));
		divisorCashe.put(4, Arrays.asList(1, 2));
	}

	private List<Integer> getDivisors(final Integer n) {
		if (divisorCashe.containsKey(n)) {
			return divisorCashe.get(n);
		}

		Set<Integer> temp = new HashSet<>();
		temp.add(1);

		for (int i = 2; i < n; i++) {
			if (n % i == 0) {
				int j = n / i;
				temp.add(i);
				temp.add(j);
				temp.addAll(getDivisors(i));
				temp.addAll(getDivisors(j));
			}
		}

		List<Integer> divisors = new ArrayList<>(temp);
		Collections.sort(divisors);

		divisorCashe.put(n, divisors);

		return divisors;
	}

	boolean isAbundant(Integer a) {
		final int b = sumOfDivisors(a);
		return b > a;
	}

	private int sumOfDivisors(Integer n) {
		return getDivisors(n).stream().reduce(0, (t, i) -> t + i);
	}

	@Override
	public Number solve() {
		problemNumber = 23;
		final int n = 28123;
		List<Integer> abundantNumbers = new ArrayList<>();
		final boolean[] sumOfAbundant = new boolean[n];
		int result = 0;

		for (int i = 1; i < n + 1; i++) {
			if (isAbundant(i)) {
				abundantNumbers.add(i);
			}

		}
		for (int i : abundantNumbers) {
			for (int j : abundantNumbers) {
				final int sum = i + j;
				if (sum < n) {
					sumOfAbundant[sum] = true;
				}
			}
		}

		for (int i = 0; i < n; i++) {
			if (!sumOfAbundant[i]) {
				result += i;
			}
		}

		return result;
	}

}
