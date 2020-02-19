import time
from Solution import Solution

class P011(Solution):
    def read_grid(self, file_name):
        grid = []
        with open(file_name) as file_in:
            for line in file_in:
                parts = line.split()
                row = []
                for part in parts:
                    row.append(int(part))
                grid.append(row)
        return grid
    
    def grid_product(self, grid, i, j, count):
        n = len(grid)
        max_product = 1
        product = 1
        if count <= (n-i):
            for k in range(i, i + count):
                product *= grid[j][k]
            if product > max_product:
                max_product = product
        
        product = 1
        if count <= (n-j):
            for k in range(j, j + count):
                product *= grid[k][i]
            if product > max_product:
                max_product = product
        
        product = 1
        if (count <= (n-i)) and (count <= (n-j)):
            for k in range(0, count):
                product *= grid[j + k][i + k]
            if product > max_product:
                max_product = product
        
        product = 1
        if (count <= (n-i)) and (j > (count -1)):
            for k in range(0, count):
                product *= grid[j - k][i + k]
            if product > max_product:
                max_product = product
        
        return max_product
    
    def solve(self):
        self.problem_number = 11
        max_product = 1
        count = 4
    
        grid = self.read_grid("p011.txt")
        n = len(grid)
        for i in range(0, n):
            for j in range(0, n):
                product = self.grid_product(grid, i, j, count)
                if product > max_product:
                    max_product = product
    
        return max_product

def main():
	P011().run()

if __name__ == "__main__":
	main()
