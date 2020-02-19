import time
import math
from Solution import Solution

class P017(Solution):
    mem_cache = {}

    def __init__(self):
        self.problem_number = 17
        self.mem_cache = {1: 'one', 2: 'two', 3: 'three', 4: 'four', 5: 'five', 6: 'six', 7: 'seven', 8: 'eight', 9: 'nine', 10: 'ten', 11: 'eleven', 12: 'twelve', 13: 'thirteen', 14: 'fourteen',
                     15: 'fifteen', 16: 'sixteen', 17: 'seventeen', 18: 'eighteen', 19: 'nineteen', 20: 'twenty', 30: 'thirty', 40: 'forty', 50: 'fifty', 60: 'sixty', 70: 'seventy', 80: 'eighty', 90: 'ninety', 1000: 'one thousand'}

    def number_as_letters(self, n):
        if n in self.mem_cache:
            return self.mem_cache[n]

        string = str(n)
        if n < 100:
            self.mem_cache[n] = self.mem_cache[int(string[0]) * 10] + \
                '-' + self.mem_cache[int(string[1])]

        if (n < 1000) and (n >= 100):
            if n % 100 == 0:
                self.mem_cache[n] = self.mem_cache[int(string[0])] + ' hundred'
            else:
                self.mem_cache[n] = self.mem_cache[int(
                    string[0])] + ' hundred and ' + self.mem_cache[int(string[1:3])]

        if n == 1000:
            self.mem_cache[n] = 'one thousand'

        return self.mem_cache[n]


    def length_of_string(self, string):
        return len(string.replace(' ', '').replace('-', ''))


    def solve(self):
        n = 1000
        result = 0

        for i in range(1, n + 1):
            data = self.number_as_letters(i)
            result += self.length_of_string(data)

        return result

def main():
	P017().run()

if __name__ == "__main__":
	main()
