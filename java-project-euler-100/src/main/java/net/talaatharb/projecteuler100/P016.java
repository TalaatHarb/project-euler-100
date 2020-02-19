package net.talaatharb.projecteuler100;

import java.math.BigInteger;

/**
 * P016
 * 
 * @author mharb
 *
 */
public class P016 extends Solution {

	/**
	 * Problem solution entry point
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		new P016().run();
	}

	@Override
	public Number solve() {
		problemNumber = 16;
		int result = 0;
		final int n = 1000;
		final BigInteger number = BigInteger.valueOf(2).pow(n);
		final String number_string = number.toString();
		for (char i : number_string.toCharArray()) {
			result += Character.getNumericValue(i);
		}

		return result;
	}

}
