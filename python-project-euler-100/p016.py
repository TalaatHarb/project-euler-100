import time
import math

def run():
    start_time = time.time()
    n = 1000
    number = 2 ** n
    number_string = str(number)
    result = 0
    for i in number_string:
        result += int(i)

    total_time = time.time() - start_time
    print('p016:', result, '->', total_time, 's')

run()
