import time


def run():
    start_time = time.time()
    last = 100
    sum = 0
    sum_of_squares = 0

    for i in range(1, last + 1):
        sum += i
        sum_of_squares += (i * i)
    
    result = (sum * sum) - sum_of_squares
    total_time = time.time() - start_time

    print('p006:', result, '->', total_time, 's')

run()