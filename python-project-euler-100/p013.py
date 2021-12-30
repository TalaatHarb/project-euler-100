from Solution import Solution

class P013(Solution):
    def read_numbers(self, file_name):
        numbers = []
        with open(file_name) as file_in:
            for line in file_in:
                numbers.append(line)
        return numbers
    
    def solve(self):
        self.problem_number = 13
        sum = 0
        numbers = self.read_numbers("p013.txt")
    
        for i in numbers:
            sum += int(i);
    
        result = int(str(sum)[0:10])
        return result

def main():
	P013().run()

if __name__ == "__main__":
	main()