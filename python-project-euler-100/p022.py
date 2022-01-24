from Solution import Solution

class P022(Solution):
    def read_names(self, file_name):
        names = []
        with open(file_name) as file_in:
            parts = file_in.read().split(',')
            for part in parts:
                names.append(part[1:-1])
            names.sort()
        return names

    def calculate_name_value(self, name):
        value = 0
        for i in range(len(name)):
            value += (ord(name[i]) - ord('A') + 1)
        return value
    
    def solve(self):
        self.problem_number = 22
        result = 0
        names = self.read_names('p022.txt')

        for i in range(len(names)):
            result += (self.calculate_name_value(names[i]) * (i + 1))

        return result

def main():
	P022().run()

if __name__ == "__main__":
	main()
