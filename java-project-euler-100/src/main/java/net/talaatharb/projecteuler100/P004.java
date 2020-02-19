package net.talaatharb.projecteuler100;

/**
 * @author mharb
 *
 */
public class P004 extends Solution {

	/**
	 * Problem solution entry point
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		new P004().run();
	}

	private boolean isPalindromic(int number) {
		final String numberAsString = String.valueOf(number);
		final int length = numberAsString.length();
		boolean result = true;
		int j = 0;

		for (int i = 0; i < length / 2; i++) {
			j = length - i - 1;
			if (numberAsString.charAt(i) != numberAsString.charAt(j)) {
				result = false;
				break;
			}
		}
		return result;
	}

	@Override
	public Number solve() {
		problemNumber = 4;
		int start = 99;
		int finish = 999;
		int result = 0;
		int i = finish;

		while (i > start) {

			for (int j = finish; j > start; j--) {

				int number = i * j;
				if (number > result && isPalindromic(number)) {
					result = number;
					break;
				}
			}
			i--;
		}

		return result;
	}
}
