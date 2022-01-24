from math import trunc
from Solution import Solution

class P023(Solution):
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

    def isAbundant(self, a):
        sum = self.sumOfDivisors(a)
        return sum > a

    def solve(self):
        self.problem_number = 23
        n = 28123
        abundant_numbers = []
        sum_of_abundant = [False for i in range(n)]
        result = 0

        for a in range(1, n + 1):
            if self.isAbundant(a):
                abundant_numbers.append(a)

        for i in abundant_numbers:
            for j in abundant_numbers:
                sum = i + j
                if(sum < n):
                    sum_of_abundant[sum] = True
        
        for a in range(n):
            if(not sum_of_abundant[a]):
                result += a

        return result

def main():
    P023().run()

if __name__ == "__main__":
    main()
