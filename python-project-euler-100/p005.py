import time
from Solution import Solution

class P005(Solution):
    def solve(self):
        self.problem_number = 5
        last = 20
        sequence = []
        result = 1
        number = 2
        counter = number
        while(counter <= last):
            for i in sequence:
                if number % i == 0:
                    number //= i
            result *= number
            sequence.append(number)
            counter += 1
            number = counter
        
        return result

def main():
	P005().run()

if __name__ == "__main__":
	main()