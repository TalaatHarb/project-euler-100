package net.talaatharb.projecteuler100;

public class P003 implements Runnable {

	private static final double NANO_TO_S = 100000000.0;
	public static void main(String[] args) {
		new P003().run();
	}

//	boolean isPrime(double number) {
//	    double upperLimit = Math.floor(Math.sqrt(number));
//	    if ((upperLimit % 2) == 0)
//	    	upperLimit -= 1;
//	    for (double i= upperLimit ; upperLimit<1 ; i-=2) {
//	        if (number % i == 0)
//	            return false;
//	    }
//	    return true;
//	}
	@Override
	public void run() {
		long startTime = System.nanoTime();
		long maxPrime = -1;
		long n = 600851475143L;
		
		while (n % 2 == 0) { 
	        maxPrime = 2; 
	          
	        // equivalent to n /= 2 
	        n >>= 1;  
	    } 
		for (int i = 3; i <= Math.sqrt(n); i += 2) { 
	        while (n % i == 0) { 
	            maxPrime = i; 
	            n = n / i; 
	        } 
	    } 
		if (n > 2) 
	        maxPrime = n; 
		double totalTime = (System.nanoTime() - startTime) / NANO_TO_S;
		System.out.println("p003: "+ maxPrime+" -> " + totalTime+" s");
//		long startTime = System.nanoTime();
//	    double number = 600851475143.0;
//	    int upperLimit = (int) Math.floor(Math.sqrt(number));
//	    if (upperLimit % 2 == 0) {
//	    	upperLimit -= 1;
//	    }
//	        
//	    
//	    double possiblFactor = upperLimit;
//	    double result = number;
//	    while (possiblFactor > 1) {
//	        if ((number % possiblFactor == 0) && isPrime(possiblFactor)) {
//	            result = possiblFactor;
//	            break;
//	        }
//	    }
//	    possiblFactor -=2;
//	    double totalTime = (System.nanoTime() - startTime) / NANO_TO_S;
//	    System.out.println("p003: "+ result+" -> " + totalTime+" s");
	}
	
}
