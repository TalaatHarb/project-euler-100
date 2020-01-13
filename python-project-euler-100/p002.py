import time
def run():
	start_time = time.time()
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

	total_time = time.time() - start_time
	print('p002:', sum , '->', total_time, 's')

run()