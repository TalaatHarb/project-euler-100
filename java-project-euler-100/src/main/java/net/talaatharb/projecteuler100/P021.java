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
 * P021
 * 
 * @author mharb
 *
 */
public class P021 extends Solution {

	private Map<Integer, List<Integer>> divisorCashe;
	private Map<Integer, Integer> sumOfDivisorCashe;

	public P021() {
		divisorCashe = new HashMap<>();
		sumOfDivisorCashe = new HashMap<>();

		divisorCashe.put(2, Arrays.asList(1));
		divisorCashe.put(3, Arrays.asList(1));
		divisorCashe.put(4, Arrays.asList(1, 2));

		sumOfDivisorCashe.put(2, 1);
		sumOfDivisorCashe.put(3, 1);
		sumOfDivisorCashe.put(4, 3);
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

	boolean isAmicable(Integer a) {
		final int b = sumOfDivisors(a);
		final int c = sumOfDivisors(b);
		return (a != b) && (a == c);
	}

	private int sumOfDivisors(Integer n) {
		if (sumOfDivisorCashe.containsKey(n)) {
			return sumOfDivisorCashe.get(n);
		}

		sumOfDivisorCashe.put(n, getDivisors(n).stream().reduce(0, (t, i) -> t + i));
		return sumOfDivisorCashe.get(n);
	}

	/**
	 * Problem solution entry point
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		new P021().run();
	}

	@Override
	public Number solve() {
		problemNumber = 21;
		final int n = 10000;
		int result = 0;
		for (int i = 1; i < (n + 1); i++) {
			if (isAmicable(i)) {
				result += i;
			}
		}

		return result;
	}
}
