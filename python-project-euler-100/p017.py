import time
import math


def number_as_letters(n, mem_cache):
    if n in mem_cache:
        return mem_cache[n], mem_cache

    string = str(n)
    if n < 100:
        mem_cache[n] = mem_cache[int(string[0]) * 10] + '-' + mem_cache[int(string[1])]

    
    if (n < 1000) and (n >= 100):
        if n % 100 == 0:
            mem_cache[n] = mem_cache[int(string[0])] + ' hundred'
        else:
            mem_cache[n] = mem_cache[int(string[0])] + ' hundred and ' + mem_cache[int(string[1:3])]

    if n == 1000:
        mem_cache[n] = 'one thousand'
    
    return mem_cache[n], mem_cache


def length_of_string(string):
    return len(string.replace(' ', '').replace('-', ''))


def run():
    start_time = time.time()
    n = 1000
    result = 0
    mem_cache = {1: 'one', 2: 'two', 3: 'three', 4: 'four', 5: 'five', 6: 'six', 7: 'seven', 8: 'eight', 9: 'nine', 10: 'ten', 11: 'eleven', 12: 'twelve', 13: 'thirteen', 14: 'fourteen',
                 15: 'fifteen', 16: 'sixteen', 17: 'seventeen', 18: 'eighteen', 19: 'nineteen', 20: 'twenty', 30: 'thirty', 40: 'forty', 50: 'fifty', 60: 'sixty', 70: 'seventy', 80: 'eighty', 90: 'ninety'}

    for i in range(1, n + 1):
        data, mem_cache = number_as_letters(i, mem_cache)
        result += length_of_string(data)

    total_time = time.time() - start_time
    print('p017:', result, '->', total_time, 's')

run()
