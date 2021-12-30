from Solution import Solution

class P016(Solution):
    def solve(self):
        self.problem_number = 16
        n = 1000
        number = 2 ** n
        number_string = str(number)
        result = 0
        for i in number_string:
            result += int(i)
    
        return result

def main():
	P016().run()

if __name__ == "__main__":
	main()
