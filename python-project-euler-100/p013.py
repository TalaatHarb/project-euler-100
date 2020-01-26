import time
import math

def read_numbers(file_name):
    numbers = []
    with open(file_name) as file_in:
        for line in file_in:
            numbers.append(line)
    return numbers

def run():
    start_time = time.time()
    n = 15  # Doing the calculations with the first 15 digits
    sum = 0
    numbers = read_numbers("p013.txt")

    for i in numbers:
        sum += int(i[-n:]);

    result = str(sum)[-10:]
    total_time = time.time() - start_time
    print('p013:', result, '->', total_time, 's')

run()