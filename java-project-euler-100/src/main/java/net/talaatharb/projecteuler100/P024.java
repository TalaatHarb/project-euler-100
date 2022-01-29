package net.talaatharb.projecteuler100;

import java.util.Stack;

/**
 * P024
 * 
 * @author mharb
 *
 */
public class P024 extends Solution {

	/**
	 * Problem solution entry point
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		new P024().run();
	}

	// Factoradic method
	private String stringPermutation(int n, String str) {

		Stack<Integer> s = new Stack<Integer>();
		StringBuilder result = new StringBuilder();

		n = n - 1;

		for (int i = 1; i < str.length() + 1; i++) {
			s.add(n % i);
			n = n / i;
		}

		for (int i = 0; i < str.length(); i++) {
			int a = s.peek();
			result.append(str.charAt(a));
			int j;

			for (j = a; j < str.length() - 1; j++)
				str = str.substring(0, j) + str.charAt(j + 1) + str.substring(j + 1);

			str = str.substring(0, j + 1);
			s.pop();
		}
		return result.toString();
	}

	@Override
	public Number solve() {
		problemNumber = 24;
		final int n = 1000000;
		final String data = "0123456789";
		
		return Long.parseLong(stringPermutation(n, data));
	}

}
