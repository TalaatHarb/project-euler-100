/**
 * 
 */
package net.talaatharb.projecteuler100;

/**
 * Base class for all the solutions
 * 
 * @author mharb
 *
 */
public abstract class Solution implements Solvable, Runnable {

	private static final double NANO_TO_S = 1000000000.0;

	protected int problemNumber = 0;

	@Override
	public final int getProblemNumber() {
		return problemNumber;
	}

	@Override
	public void run() {
		final long startTime = System.nanoTime();

		// Solving the problem
		final Number result = solve();

		final double period = (System.nanoTime() - startTime) / NANO_TO_S;
		System.out.println("p" + ("000" + problemNumber).substring((problemNumber + "").length()) + ": " + result
				+ " -> " + period + " s");
	}
}
