import time

class P004:
    def is_palindromic(self, number):
        number_as_string = str(number)
        reverse = number_as_string[::-1]
        if reverse == number_as_string:
            return True
        else:
            return False

    def run(self):
        start_time = time.time()
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
        total_time = time.time() - start_time
        print('p004:', result, '->', total_time, 's')

def main():
	P004().run()

if __name__ == "__main__":
	main()