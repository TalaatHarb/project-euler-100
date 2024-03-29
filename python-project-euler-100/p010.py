from Solution import Solution

class P010(Solution):
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
    
    def solve(self):
        self.problem_number = 10
        last = 2000000
        list_of_primes = self.sieve_of_eratosthenes(last)
        sum_of_primes = sum(list_of_primes)
    
        return sum_of_primes

def main():
	P010().run()

if __name__ == "__main__":
	main()