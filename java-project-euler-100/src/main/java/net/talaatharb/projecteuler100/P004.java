package net.talaatharb.projecteuler100;

/**
 * @author mharb
 *
 */
public class P004 implements Runnable {

	/**
	 * Problem solution entry point
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		new P004().run();
	}

	private static final double NANO_TO_S = 100000000.0;

	@Override
	public void run() {
		final long startTime = System.nanoTime();
		int start = 99;
		int finish = 999;
		int result = 0;
		boolean notDone = true;
		int i = finish;
		
		while(notDone && (i>start)) {
			
		
			for (int j = finish; j > start; j--) {
				
				int number = i * j;
				if (number>result && isPalindromic(number)) {
					result = number;
			        break;
				}
				
			}
			i--;
			
		}
			    
		final double period = (System.nanoTime() - startTime) / NANO_TO_S;
		System.out.println("p004: " + result + " -> " + period + " s");
	}

	public boolean isPalindromic(int number) {
		String reverse ="";
		String numberAsString = String.valueOf(number); 
	      int length = numberAsString.length();   
	      for ( int i = length - 1; i >= 0; i-- )  
	         reverse = reverse + numberAsString.charAt(i);  
	      if (numberAsString.equals(reverse))  
	         return true;  
	      else  
	    	  return false;   
		
		
	}
}
