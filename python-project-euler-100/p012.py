import time
from Solution import Solution

class P012(Solution):
    def sieve_of_eratosthenes(self, n): 
          
        # Create a boolean array "prime[0..n]" and initialize 
        # all entries in it as true. A value in prime[i] will 
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
    
    def triangular_number(self, n):
        return (n * (n + 1) // 2)
    
    
    def number_of_divisors(self, n, primes):
        result = 1
        if n in primes:
            result = 2
            return result
        for i in primes:
            num = 0
            while n % i == 0:
                num += 1
                n //= i
            if num > 0:
                result *= (num + 1)
            if i > n:
                break
        return result
    
    
    
    def solve(self):
        self.problem_number = 12
        max = 100000
        result = 1
        target = 500
        primes = self.sieve_of_eratosthenes(max)
        i = 1
        while result == 1:
            tn = self.triangular_number(i)
            n = self.number_of_divisors(tn, primes)
            if n > target:
                result = tn
            i += 1
        
        return result

def main():
	P012().run()

if __name__ == "__main__":
	main()
