import time
import math

def is_prime(number):
    upper_limit = math.floor(math.sqrt(number))
    if upper_limit % 2 == 0:
        upper_limit -= 1
    for i in range(upper_limit, 1, -2):
        if number % i == 0:
            return False
    return True

def run():
	start_time = time.time()
	target = 10001
	counter = 1
	current = 0

	i = 1
	while counter <= target:
		if is_prime(i):
			current = i
			counter += 1
		i += 2
	
	total_time = time.time() - start_time
	print('p007:', current, '->', total_time, 's')

run()