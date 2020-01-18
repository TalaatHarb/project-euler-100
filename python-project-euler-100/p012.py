import time


def triangular_number(n):
    return (n * (n + 1) // 2)


def number_of_divisors(n):
    num = 1
    for i in range(2, n + 1):
        if n % i == 0:
            num += 1
    return num

def run():
    start_time = time.time()
    target = 500
    result = 1
    i = 2
    while result == 1:
        number = triangular_number(i)
        n = number_of_divisors(number)
        if n > target:
            result = number
        i += 1

    total_time = time.time() - start_time
    print('p012:', result, '->', total_time, 's')


run()
