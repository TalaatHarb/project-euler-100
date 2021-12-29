from Solution import Solution

class P014(Solution):
    mem_cache = {1: 0}

    def collatz(self, number):
        if number in self.mem_cache:
            return self.mem_cache[number]

        if number % 2 == 0:
            data = self.collatz((number // 2))
            self.mem_cache[number] = data + 1
            return (1 + data)

        if number % 2 == 1:
            data = self.collatz((3 * number + 1))
            self.mem_cache[number] = data + 1
            return (1 + data)

    def solve(self):
        self.problem_number = 14
        last = 1000000
        max_number = 1
        max_length = self.mem_cache[max_number];

        for i in range(2, last):
            sequence_length = self.collatz(i)
            if sequence_length > max_length:
                max_length = sequence_length
                max_number = i

        return max_number

def main():
	P014().run()

if __name__ == "__main__":
	main()
