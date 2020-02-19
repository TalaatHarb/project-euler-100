import time
import math
from Solution import Solution

class P020(Solution):
    mem_cache = {0: 1}
        
    def digits_sum(self, segment):
        sum = 0
        for i in segment:
            sum += int(i)
        return sum

    def factorial(self, n):
        if n in self.mem_cache:
            return self.mem_cache[n]
        data = self.factorial(n - 1)
        self.mem_cache[n] = data * n
        return self.mem_cache[n] 

    def solve(self):
        self.problem_number = 20
        n = 100

        for i in range(1, n):
            self.factorial(i)

        result = self.digits_sum(str(self.factorial(n)))

        return result

def main():
    P020().run()

if __name__ == "__main__":
    main()
