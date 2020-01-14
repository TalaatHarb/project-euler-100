package net.talaatharb.projecteuler100;

import java.util.ArrayList;
import java.util.List;

public class P005 implements Runnable {

	private static final double NANO_TO_S = 100000000.0;

	public static void main(String[] args) {
		new P005().run();
	}

	@Override
	public void run() {
		long startTime = System.nanoTime();
	    int last = 20;
	    List sequence = new ArrayList<Integer>();
	    int result = 1;
	    int number = 2;
	    int counter = number;
	    long maxNumber = Long.MAX_VALUE;
	    int n;
        for (n = 2520 ; n < maxNumber; n++) {
            if (n % 20 == 0 && n % 19 == 0 && n % 17 == 0 && n % 16 == 0 && n % 13 == 0 && n % 12 == 0 && n % 11 == 0
                    && n % 9 == 0 && n % 7 == 0 && n % 5 == 0 && n % 3 == 0 && n % 2 == 0) {
                System.out.println(n);
                break;
            }
        }
        
		double totalTime = (System.nanoTime() - startTime) / NANO_TO_S;
		System.out.println("p003: "+ n+" -> " + totalTime+" s");
	
	}

}
