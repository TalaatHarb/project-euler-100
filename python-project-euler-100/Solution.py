import time
from abc import ABC, abstractmethod

class Solution(ABC):
    def __init__(self):
        self.problem_number = 0
        
    @abstractmethod
    def solve(self):
        pass
    
    def run(self):
        start_time = time.time()
        result = self.solve()
        total_time = time.time() - start_time

        print('p001:', result, '->', total_time, 's')