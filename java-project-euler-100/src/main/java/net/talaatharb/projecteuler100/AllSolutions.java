package net.talaatharb.projecteuler100;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @author mharb
 *
 */
public class AllSolutions {

	private static final double NANO_TO_S = 1000000000.0;

	private static void solveParallel() {
		System.out.println("Running in parallel");
		final int numOfSimultaneousProblems = 20;
		ExecutorService executor = Executors.newFixedThreadPool(numOfSimultaneousProblems);

		executor.execute(new P001());
		executor.execute(new P002());
		executor.execute(new P003());
		executor.execute(new P004());
		executor.execute(new P005());
		executor.execute(new P006());
		executor.execute(new P007());
		executor.execute(new P008());
		executor.execute(new P009());
		executor.execute(new P010());
		executor.execute(new P011());
		executor.execute(new P012());
		executor.execute(new P013());
		executor.execute(new P014());
		executor.execute(new P015());
		executor.execute(new P016());
		executor.execute(new P017());
		executor.execute(new P018());
		executor.execute(new P019());
		executor.execute(new P020());

		executor.shutdown();
		while (!executor.isTerminated())
			;
	}

	private static void solveSequential() {
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
		new P011().run();
		new P012().run();
		new P013().run();
		new P014().run();
		new P015().run();
		new P016().run();
		new P017().run();
		new P018().run();
		new P019().run();
		new P020().run();
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		final long startTime = System.nanoTime();

		if (args != null && args.length > 0 && args[0].equals("-p")) {
			solveParallel();
		} else {
			solveSequential();
		}

		final double totalTime = (System.nanoTime() - startTime) / NANO_TO_S;
		System.out.println("Total time: " + totalTime + " s");
	}

}
