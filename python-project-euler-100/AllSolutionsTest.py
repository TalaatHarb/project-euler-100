import unittest
import time

from p001 import P001

class AllSolutionsTest(unittest.TestCase):

    MAX_TIME = 60.0

    def solve_and_test(self, expected_result, problem):
        
        start_time = time.time()
        result = problem.solve()
        total_time = time.time() - start_time

        self.assertEqual(expected_result, result)
        self.assertTrue(total_time < self.MAX_TIME)

        print('p001:', result, '->', total_time, 's')

    def test_p001(self):
        expected_result = 233168
        self.solve_and_test(expected_result, P001())

if __name__ == '__main__':
    unittest.main()
