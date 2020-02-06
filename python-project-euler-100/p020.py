import time
import math

class P020:
    mem_cache = {0: 1}
        
    def digits_sum(self, segment):
        sum = 0
        for i in segment:
            sum += int(i)
        return sum

    def factorial(self, n):
        if n in self.mem_cache:
            return self.mem_cache[n]
        data = self.factorial(n - 1)
        self.mem_cache[n] = data * n
        return self.mem_cache[n] 

    def run(self):
        start_time = time.time()
        n = 100

        for i in range(1, n):
            self.factorial(i)

        result = self.digits_sum(str(self.factorial(n)))

        total_time = time.time() - start_time
        print('p020:', result, '->', total_time, 's')

def main():
    P020().run()

if __name__ == "__main__":
    main()
