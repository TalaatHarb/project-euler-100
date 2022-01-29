package net.talaatharb.projecteuler100;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @author mharb
 *
 */
public class AllSolutions {

	private static final double NANO_TO_S = 1000000000.0;

	private static void solveParallel(final List<Solution> problems) {
		System.out.println("Running in parallel");
		final int numOfSimultaneousProblems = problems.size();
		ExecutorService executor = Executors.newFixedThreadPool(numOfSimultaneousProblems);

		for (final Solution problem : problems) {
			executor.execute(problem);
		}

		executor.shutdown();
		while (!executor.isTerminated())
			;
	}

	private static void solveSequential(final List<Solution> problems) {
		for(final Solution problem: problems) {
			problem.run();
		}
	}

	private static List<Solution> getProblems() {
		final List<Solution> result = new ArrayList<>();

		result.add(new P001());
		result.add(new P002());
		result.add(new P003());
		result.add(new P004());
		result.add(new P005());
		result.add(new P006());
		result.add(new P007());
		result.add(new P008());
		result.add(new P009());
		result.add(new P010());
		result.add(new P011());
		result.add(new P012());
		result.add(new P013());
		result.add(new P014());
		result.add(new P015());
		result.add(new P016());
		result.add(new P017());
		result.add(new P018());
		result.add(new P019());
		result.add(new P020());
		result.add(new P021());
		result.add(new P022());
		result.add(new P023());
		result.add(new P024());
		result.add(new P025());

		return result;
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		final List<Solution> problems = getProblems();

		final long startTime = System.nanoTime();

		if (args != null && args.length > 0 && args[0].equals("-p")) {
			solveParallel(problems);
		} else {
			solveSequential(problems);
		}

		final double totalTime = (System.nanoTime() - startTime) / NANO_TO_S;
		System.out.println("Total time: " + totalTime + " s");
	}

}
