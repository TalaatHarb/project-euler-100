import time
import math

class P013:
    def read_numbers(self, file_name):
        numbers = []
        with open(file_name) as file_in:
            for line in file_in:
                numbers.append(line)
        return numbers
    
    def run(self):
        start_time = time.time()
        sum = 0
        numbers = self.read_numbers("p013.txt")
    
        for i in numbers:
            sum += int(i);
    
        result = str(sum)[0:10]
        total_time = time.time() - start_time
        print('p013:', result, '->', total_time, 's')

def main():
	P013().run()

if __name__ == "__main__":
	main()