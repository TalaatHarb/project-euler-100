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
    number = 600851475143
    upper_limit = math.floor(math.sqrt(number))
    if upper_limit % 2 == 0:
        upper_limit -= 1
    
    possible_factor = upper_limit
    result = number
    while possible_factor > 1:
        if (number % possible_factor == 0) and is_prime(possible_factor):
            result = possible_factor
            break
        possible_factor -=2

    print('p003:', result)

run()