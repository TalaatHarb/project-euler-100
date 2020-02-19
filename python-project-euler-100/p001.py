import time
from Solution import Solution

class P001(Solution):
	def solve(self):
		self.problem_number = 1
		last = 1000
		sum = 0

		for i in range(1,last):
			if (i % 3 == 0) or (i % 5 == 0):
				sum = sum + i

		return sum

def main():
	P001().run()

if __name__ == "__main__":
	main()