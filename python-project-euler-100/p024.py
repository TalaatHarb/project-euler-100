from math import trunc
from Solution import Solution

class P024(Solution):

    # Factoradic method
    def string_permutation(self, n, str):
   
        s = []
        result = ""
        str = list(str)
        n = n - 1
    
        for i in range(1, len(str) + 1):
            s.append(n % i)
            n = int(n / i)
    
        for i in range(len(str)):
            a = s[-1]
            result += str[a]

            for j in range(a, len(str) - 1):
                str[j] = str[j + 1]

            str[j + 1] = '\0'
            s.pop()

        return result

    def solve(self):
        self.problem_number = 24
        n = 1000000
        data = '0123456789'
        result = int(self.string_permutation(n, data))

        return result

def main():
    P024().run()

if __name__ == "__main__":
    main()
