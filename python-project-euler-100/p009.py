import time
import math

class P009:
	def run(self):
		start_time = time.time()
		target_sum = 1000
		product = 0
		for a in range(1, target_sum - 2):
			for b in range(a + 1, target_sum - 1):
				sum_of_squares = a**2 + b**2
				c = (math.sqrt(sum_of_squares))
				sum = a + b + c
				if sum == target_sum:
					c = math.floor(c)
					product = a * b * c
		total_time = time.time() - start_time
		print('p009:', product, '->', total_time, 's')

def main():
	P009().run()

if __name__ == "__main__":
	main()