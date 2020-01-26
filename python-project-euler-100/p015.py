import time
import math

def factorial(n, mem_cache):
    if n in mem_cache:
        return mem_cache[n], mem_cache
    data, mem_cache = factorial(n - 1, mem_cache)
    mem_cache[n] = data * n
    return mem_cache[n], mem_cache 

def run():
    start_time = time.time()
    n = 20
    mem_cache = {0:1}
    
    for i in range(1, 2 * n):
        x, mem_cache = factorial(i, mem_cache)
    
    route_count = factorial(2 * n, mem_cache)[0] // (factorial(n, mem_cache)[0]**2)

    total_time = time.time() - start_time
    print('p015:', route_count, '->', total_time, 's')


run()
