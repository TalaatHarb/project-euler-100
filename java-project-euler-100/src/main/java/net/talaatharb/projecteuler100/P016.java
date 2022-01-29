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
		final BigInteger power = BigInteger.valueOf(2).pow(n);
		final String powerString = power.toString();
		for (char i : powerString.toCharArray()) {
			result += Character.getNumericValue(i);
		}

		return result;
	}

}
