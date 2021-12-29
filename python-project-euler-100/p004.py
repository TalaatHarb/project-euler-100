from Solution import Solution

class P004(Solution):
    def is_palindromic(self, number):
        number_as_string = str(number)
        reverse = number_as_string[::-1]
        if reverse == number_as_string:
            return True
        else:
            return False

    def solve(self):
        self.problem_number = 4
        start = 99
        finish = 999
        result = 0
        not_done = True
        i = finish
        while not_done and (i > start):
            for j in range(finish, start, -1):
                number = i * j
                if self.is_palindromic(number) and (number > result):
                    result = number
                    break
            i -= 1
        return result

def main():
	P004().run()

if __name__ == "__main__":
	main()