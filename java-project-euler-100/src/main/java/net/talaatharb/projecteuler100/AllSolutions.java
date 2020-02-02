package net.talaatharb.projecteuler100;

/**
 * @author mharb
 *
 */
public class AllSolutions {

	private static final double NANO_TO_S = 100000000.0;

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		final long startTime = System.nanoTime();

		new P001().run();
		new P002().run();
		new P003().run();
		new P004().run();
		new P005().run();
		new P006().run();
		new P007().run();
		new P008().run();
		new P009().run();
		new P010().run();

		final double totalTime = (System.nanoTime() - startTime) / NANO_TO_S;
		System.out.println("Total time: " + totalTime + " s");
	}

}
