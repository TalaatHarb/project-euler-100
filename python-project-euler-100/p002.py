from Solution import Solution

class P002(Solution):
	def solve(self):
		self.problem_number = 2
		max = 4000000
		previous = 1
		current = 2
		sum = current

		while current < max:
			next = previous + current
			if (next < max) and (next % 2 == 0):
				sum += next
			previous = current
			current = next

		return sum

def main():
	P002().run()

if __name__ == "__main__":
	main()