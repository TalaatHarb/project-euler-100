import time
import math
from Solution import Solution


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

class P007(Solution):
    def solve(self):
        self.problem_number = 7
        target = 10001
        counter = 1
        current = 0
    
        i = 1
        while counter <= target:
            if is_prime(i):
                current = i
                counter += 1
            i += 2
    
        return current

def main():
	P007().run()

if __name__ == "__main__":
	main()
