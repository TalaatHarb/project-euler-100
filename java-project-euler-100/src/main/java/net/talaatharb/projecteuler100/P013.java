package net.talaatharb.projecteuler100;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;

/**
 * P013
 * 
 * @author mharb
 *
 */
public class P013 extends Solution {

	/**
	 * Problem solution entry point
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		new P013().run();
	}

	private List<String> readNumbers(final String fileName) {
		List<String> numbers = new ArrayList<>();

		ClassLoader classLoader = Thread.currentThread().getContextClassLoader();

		InputStreamReader streamReader = new InputStreamReader(classLoader.getResourceAsStream(fileName));
		BufferedReader reader = new BufferedReader(streamReader);
		try {
			for (String line; (line = reader.readLine()) != null;) {
				numbers.add(line);
			}
			reader.close();
			streamReader.close();
		} catch (IOException e) {
			System.err.println(e.getMessage());
		}

		return numbers;
	}

	@Override
	public Number solve() {
		problemNumber = 13;
		BigInteger sum = BigInteger.valueOf(0);
		final List<String> numbers = readNumbers("p013.txt");

		for (String line : numbers) {
			sum = sum.add(new BigInteger(line));
		}
		final long result = Long.parseLong(sum.toString().substring(0, 10));

		return result;
	}

}
