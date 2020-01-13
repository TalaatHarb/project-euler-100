import time

def run():
	start_time = time.time()
	last = 1000
	sum = 0

	for i in range(1,last):
		if (i % 3 == 0) or (i % 5 == 0):
			sum = sum + i
	total_time = time.time() - start_time

	print('p001:', sum, '->', total_time, 's')

run()