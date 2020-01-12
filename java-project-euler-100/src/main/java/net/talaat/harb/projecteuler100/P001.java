package net.talaat.harb.projecteuler100;

/**
 * @author mharb
 *
 */
public class P001 implements Runnable {

	/**
	 * Problem solution entry point
	 * @param args
	 */
	public static void main(String[] args) {
		new P001().run();
	}

	@Override
	public void run() {
		int last = 1000;
		int sum = 0;

		for (int i = 1; i < last; i++) {
			if ((i % 3 == 0) || (i % 5 == 0)) {
				sum = sum + i;
			}
		}
		System.out.println("p001: " + sum);
	}

}
