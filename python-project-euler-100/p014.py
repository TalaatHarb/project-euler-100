import time
import math


def collatz(number, mem_cache):
    if number in mem_cache:
        return mem_cache[number], mem_cache

    if number % 2 == 0:
        data, mem_cache = collatz((number // 2), mem_cache)
        mem_cache[number] = data + 1
        return (1 + data), mem_cache

    if number % 2 == 1:
        data, mem_cache = collatz((3 * number + 1), mem_cache)
        mem_cache[number] = data + 1
        return (1 + data), mem_cache


def run():
    start_time = time.time()
    max_number = 1
    max_length = 0
    last = 1000000
    mem_cache = {max_number: max_length}

    for i in range(2, last):
        sequence_length, mem_cache = collatz(i, mem_cache)
        if sequence_length > max_length:
            max_length = sequence_length
            max_number = i

    total_time = time.time() - start_time
    print('p013:', max_number, '->', total_time, 's')

run()
