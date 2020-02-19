package net.talaatharb.projecteuler100;

import java.util.HashMap;
import java.util.Map;

/**
 * P017
 * 
 * @author mharb
 *
 */
public class P017 extends Solution {

	private final Map<Integer, String> memoryCache;

	/**
	 * Public constructor
	 */
	public P017() {
		memoryCache = new HashMap<>();
		memoryCache.put(1, "one");
		memoryCache.put(2, "two");
		memoryCache.put(3, "three");
		memoryCache.put(4, "four");
		memoryCache.put(5, "five");
		memoryCache.put(6, "six");
		memoryCache.put(7, "seven");
		memoryCache.put(8, "eight");
		memoryCache.put(9, "nine");
		memoryCache.put(10, "ten");
		memoryCache.put(11, "eleven");
		memoryCache.put(12, "twelve");
		memoryCache.put(13, "thirteen");
		memoryCache.put(14, "fourteen");
		memoryCache.put(15, "fifteen");
		memoryCache.put(16, "sixteen");
		memoryCache.put(17, "seventeen");
		memoryCache.put(18, "eighteen");
		memoryCache.put(19, "nineteen");
		memoryCache.put(20, "twenty");
		memoryCache.put(30, "thirty");
		memoryCache.put(40, "forty");
		memoryCache.put(50, "fifty");
		memoryCache.put(60, "sixty");
		memoryCache.put(70, "seventy");
		memoryCache.put(80, "eighty");
		memoryCache.put(90, "ninety");
		memoryCache.put(1000, "one thousand");
	}

	private String numberAsLetters(final int n) {
		if (memoryCache.containsKey(n)) {
			return memoryCache.get(n);
		}

		String string = n + "";
		if (n < 100) {
			memoryCache.put(n, memoryCache.get(10 * Character.getNumericValue(string.charAt(0))) + '-'
					+ memoryCache.get(Character.getNumericValue(string.charAt(1))));
		}

		if ((n < 1000) && (n >= 100)) {
			if (n % 100 == 0) {
				memoryCache.put(n, memoryCache.get(Character.getNumericValue(string.charAt(0))) + " hundred");
			} else {
				memoryCache.put(n, memoryCache.get(Character.getNumericValue(string.charAt(0))) + " hundred and "
						+ memoryCache.get(Integer.parseInt(string.substring(1, 3))));
			}
		}

		return memoryCache.get(n);
	}

	private int lengthOfString(final String string) {
		return string.replace(" ", "").replace("-", "").length();
	}

	/**
	 * Problem solution entry point
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		new P017().run();
	}

	@Override
	public Number solve() {
		problemNumber = 17;
		int result = 0;
		final int n = 1000;
		for (int i = 1; i < (n + 1); i++) {
			final String data = numberAsLetters(i);
			result += lengthOfString(data);
		}

		return result;
	}

}
