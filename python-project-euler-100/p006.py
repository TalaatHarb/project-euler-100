from Solution import Solution

class P006(Solution):
    def solve(self):
        self.problem_number = 6
        last = 100
        sum = 0
        sum_of_squares = 0
    
        for i in range(1, last + 1):
            sum += i
            sum_of_squares += (i * i)
        
        result = (sum * sum) - sum_of_squares
        return result

def main():
	P006().run()

if __name__ == "__main__":
	main()
