from math import trunc
from Solution import Solution


class P025(Solution):

    memory_cache = {1: 1, 2: 1}

    # Factoradic method
    def fib(self, n):
        if n in self.memory_cache:
            return self.memory_cache[n]

        self.memory_cache[n] = self.fib(n - 2) + self.fib(n - 1)

        return self.memory_cache[n]

    def solve(self):
        self.problem_number = 25
        n = 1000

        i = 1
        a = self.fib(i)
        while len(str(a)) < n:
            i += 1
            a = self.fib(i)

        return i


def main():
    P025().run()


if __name__ == "__main__":
    main()
