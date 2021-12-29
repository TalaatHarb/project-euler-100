from Solution import Solution

class P015(Solution):
    mem_cache = {0: 1}
    def factorial(self, n):
        if n in self.mem_cache:
            return self.mem_cache[n]
        data = self.factorial(n - 1)
        self.mem_cache[n] = data * n
        return self.mem_cache[n] 

    def solve(self):
        self.problem_number = 15
        n = 20

        for i in range(1, 2 * n):
            x = self.factorial(i)

        route_count = self.factorial(2 * n) // (self.factorial(n)**2)

        return route_count

def main():
	P015().run()

if __name__ == "__main__":
	main()
