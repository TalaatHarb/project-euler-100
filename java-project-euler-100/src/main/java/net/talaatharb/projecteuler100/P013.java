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
public class P013 implements Runnable {

	private static final double NANO_TO_S = 100000000.0;

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

	/**
	 * Problem solution entry point
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		new P013().run();
	}

	@Override
	public void run() {
		long startTime = System.nanoTime();
		BigInteger sum = BigInteger.valueOf(0);
		final List<String> numbers = readNumbers("p013.txt");

		for (String line : numbers) {
			sum = sum.add(new BigInteger(line));
		}
		final long result = Long.parseLong(sum.toString().substring(0, 10));
		double totalTime = (System.nanoTime() - startTime) / NANO_TO_S;
		System.out.println("p013: " + result + " -> " + totalTime + " s");

	}

}
