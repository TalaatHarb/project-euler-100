package net.talaatharb.projecteuler100;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

/**
 * @author mharb
 *
 */
class AllSolutionsTest {

	private static final double MAX_TIME = 60.0;
	private static final double NANO_TO_S = 1000000000.0;

	private void solveAndTest(final Number expectedResult, final Solvable problem) {
		final long startTime = System.nanoTime();
		final Number result = problem.solve();
		final double totalTime = (System.nanoTime() - startTime) / NANO_TO_S;

		assertEquals(expectedResult.toString(), result.toString());
		assertTrue(totalTime < MAX_TIME);

		System.out.println(
				"p" + ("000" + problem.getProblemNumber()).substring((problem.getProblemNumber() + "").length()) + ": "
						+ result + " -> " + totalTime + " s");
	}

	/**
	 * Testing P001
	 */
	@Test
	void testP001() {
		final Number expectedResult = 233168;
		solveAndTest(expectedResult, new P001());
	}

	/**
	 * Testing P002
	 */
	@Test
	void testP002() {
		final Number expectedResult = 4613732;
		solveAndTest(expectedResult, new P002());
	}

	/**
	 * Testing P003
	 */
	@Test
	void testP003() {
		final Number expectedResult = 6857;
		solveAndTest(expectedResult, new P003());
	}

	/**
	 * Testing P004
	 */
	@Test
	void testP004() {
		final Number expectedResult = 906609;
		solveAndTest(expectedResult, new P004());
	}

	/**
	 * Testing P005
	 */
	@Test
	void testP005() {
		final Number expectedResult = 232792560;
		solveAndTest(expectedResult, new P005());
	}

	/**
	 * Testing P006
	 */
	@Test
	void testP006() {
		final Number expectedResult = 25164150;
		solveAndTest(expectedResult, new P006());
	}

	/**
	 * Testing P007
	 */
	@Test
	void testP007() {
		final Number expectedResult = 104743;
		solveAndTest(expectedResult, new P007());
	}

	/**
	 * Testing P008
	 */
	@Test
	void testP008() {
		final Number expectedResult = 23514624000L;
		solveAndTest(expectedResult, new P008());
	}

	/**
	 * Testing P009
	 */
	@Test
	void testP009() {
		final Number expectedResult = 31875000;
		solveAndTest(expectedResult, new P009());
	}

	/**
	 * Testing P010
	 */
	@Test
	void testP010() {
		final Number expectedResult = 142913828922L;
		solveAndTest(expectedResult, new P010());
	}

	/**
	 * Testing P011
	 */
	@Test
	void testP011() {
		final Number expectedResult = 70600674;
		solveAndTest(expectedResult, new P011());
	}

	/**
	 * Testing P012
	 */
	@Test
	void testP012() {
		final Number expectedResult = 76576500;
		solveAndTest(expectedResult, new P012());
	}

	/**
	 * Testing P013
	 */
	@Test
	void testP013() {
		final Number expectedResult = 5537376230L;
		solveAndTest(expectedResult, new P013());
	}

	/**
	 * Testing P014
	 */
	@Test
	void testP014() {
		final Number expectedResult = 837799;
		solveAndTest(expectedResult, new P014());
	}

	/**
	 * Testing P015
	 */
	@Test
	void testP015() {
		final Number expectedResult = 137846528820L;
		solveAndTest(expectedResult, new P015());
	}

	/**
	 * Testing P016
	 */
	@Test
	void testP016() {
		final Number expectedResult = 1366;
		solveAndTest(expectedResult, new P016());
	}

	/**
	 * Testing P017
	 */
	@Test
	void testP017() {
		final Number expectedResult = 21124;
		solveAndTest(expectedResult, new P017());
	}

	/**
	 * Testing P018
	 */
	@Test
	void testP018() {
		final Number expectedResult = 1074;
		solveAndTest(expectedResult, new P018());
	}

	/**
	 * Testing P019
	 */
	@Test
	void testP019() {
		final Number expectedResult = 171;
		solveAndTest(expectedResult, new P019());
	}

	/**
	 * Testing P020
	 */
	@Test
	void testP020() {
		final Number expectedResult = 648;
		solveAndTest(expectedResult, new P020());
	}

}
