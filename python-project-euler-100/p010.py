import time
import math

def is_prime(number):
    if number % 2 == 0:
        return False
    upper_limit = math.floor(math.sqrt(number))
    if upper_limit % 2 == 0:
        upper_limit -= 1
    for i in range(upper_limit, 1, -2):
        if number % i == 0:
            return False
    return True

def run():
    start_time = time.time()
    last = 2000000
    sum = 2

    for i in range(3, last, 2):
        if is_prime(i):
            sum += i

    total_time = time.time() - start_time

    print('p010:', sum, '->', total_time, 's')

run()