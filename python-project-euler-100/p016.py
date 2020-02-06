import time
import math

class P016:
    def run(self):
        start_time = time.time()
        n = 1000
        number = 2 ** n
        number_string = str(number)
        result = 0
        for i in number_string:
            result += int(i)
    
        total_time = time.time() - start_time
        print('p016:', result, '->', total_time, 's')

def main():
	P016().run()

if __name__ == "__main__":
	main()
