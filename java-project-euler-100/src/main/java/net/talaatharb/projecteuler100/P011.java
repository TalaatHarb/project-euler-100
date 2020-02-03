package net.talaatharb.projecteuler100;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/**
 * P011
 * 
 * @author mharb
 *
 */
public class P011 implements Runnable {

	private static final double NANO_TO_S = 100000000.0;

	private List<int[]> readGrid(final String fileName) {
		List<int[]> grid = new ArrayList<>();

		ClassLoader classLoader = Thread.currentThread().getContextClassLoader();

		InputStreamReader streamReader = new InputStreamReader(classLoader.getResourceAsStream(fileName));
		BufferedReader reader = new BufferedReader(streamReader);
		try {
			for (String line; (line = reader.readLine()) != null;) {
				final String[] parts = line.split("\\s+");
				final int[] row = new int[parts.length];
				for (int i = 0; i < parts.length; i++) {
					row[i] = Integer.parseInt(parts[i]);
				}
				grid.add(row);
			}
			reader.close();
			streamReader.close();
		} catch (IOException e) {
			System.err.println(e.getMessage());
		}

		return grid;
	}

	private static final int gridProduct(final List<int[]> grid, final int i, final int j, final int count) {
		final int n = grid.size();
		int maxProduct = 1;

		int product = 1;
		if (count <= (n - i)) {
			for (int k = i; k < (i + count); k++) {
				product *= grid.get(j)[k];
				if (product > maxProduct) {
					maxProduct = product;
				}
			}
		}

		product = 1;
		if (count <= (n - j)) {
			for (int k = j; k < (j + count); k++) {
				product *= grid.get(k)[i];
				if (product > maxProduct) {
					maxProduct = product;
				}
			}
		}

		product = 1;
		if ((count <= (n - i)) && (count <= (n - j))) {
			for (int k = 0; k < count; k++) {
				product *= grid.get(j + k)[i + k];
				if (product > maxProduct) {
					maxProduct = product;
				}
			}
		}

		product = 1;
		if ((count <= (n - i)) && (j > (count - 1))) {
			for (int k = 0; k < count; k++) {
				product *= grid.get(j - k)[i + k];
				if (product > maxProduct) {
					maxProduct = product;
				}
			}
		}
		return maxProduct;
	}

	/**
	 * Problem solution entry point
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		new P011().run();
	}

	@Override
	public void run() {
		final long startTime = System.nanoTime();

		int maxProduct = 1;
		int product = 1;
		int count = 4;
		final List<int[]> grid = readGrid("p011.txt");

		final int n = grid.size();
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				product = gridProduct(grid, i, j, count);
				if (product > maxProduct) {
					maxProduct = product;
				}
			}
		}
		final double totalTime = (System.nanoTime() - startTime) / NANO_TO_S;
		System.out.println("p011: " + maxProduct + " -> " + totalTime + " s");
	}

}
