from math import trunc
from Solution import Solution

class P021(Solution):
    divisors_cache = {2:[1], 3: [1], 4:[1,2]}
    sum_of_divisors_cache = {2: 1, 3: 1, 4: 3}

    def sumOfDivisors(self, n):
        self.sum_of_divisors_cache[n] = sum(self.getDivisors(n))
        return self.sum_of_divisors_cache[n]

    def getDivisors(self, n):
        if n in self.divisors_cache:
            return self.divisors_cache[n]
        
        temp = [1]

        for i in range(2, n):
            if n % i == 0:
                j = n // i
                temp.append(i)
                temp.append(j)
                temp.extend(self.getDivisors(i))
                temp.extend(self.getDivisors(j))

        temp = list(set(temp))
        temp.sort()
        self.divisors_cache[n] = temp
        return self.divisors_cache[n]

    def isAmicable(self, a):
        b = self.sumOfDivisors(a)
        return a != b and a == self.sumOfDivisors(b)

    def solve(self):
        self.problem_number = 21
        n = 10000
        result = 0
        for a in range(1, n + 1):
            if self.isAmicable(a):
                result += a

        return result

def main():
    P021().run()

if __name__ == "__main__":
    main()
