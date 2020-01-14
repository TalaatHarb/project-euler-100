import time
import math

def sieve_of_eratosthenes(n): 
      
    # Create a boolean array "prime[0..n]" and initialize 
    # all entries it as true. A value in prime[i] will 
    # finally be false if i is Not a prime, else true. 
    prime = [True for i in range(n + 1)] 
    p = 2
    while (p * p <= n): 
          
        # If prime[p] is not changed, then it is a prime 
        if (prime[p] == True): 
              
            # Update all multiples of p 
            for i in range(p * 2, n + 1, p): 
                prime[i] = False
        p += 1
    prime[0]= False
    prime[1]= False
    return [index for index,value in enumerate(prime) if prime[index]]

def run():
    start_time = time.time()
    last = 2000000
    sum_of_primes = sum(sieve_of_eratosthenes(last))

    total_time = time.time() - start_time

    print('p010:', sum_of_primes, '->', total_time, 's')

run()