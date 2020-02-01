import time
import math

def digits_sum(segment):
	sum = 0
	for i in segment:
		sum += int(i)
	return sum

def factorial(n, mem_cache):
    if n in mem_cache:
        return mem_cache[n], mem_cache
    data, mem_cache = factorial(n - 1, mem_cache)
    mem_cache[n] = data * n
    return mem_cache[n], mem_cache 

def run():
    start_time = time.time()
    n = 100
    mem_cache = {0:1}
    
    for i in range(1, n):
        x, mem_cache = factorial(i, mem_cache)
    
    result = digits_sum(str(factorial(n, mem_cache)[0]))

    total_time = time.time() - start_time
    print('p015:', result, '->', total_time, 's')


run()
