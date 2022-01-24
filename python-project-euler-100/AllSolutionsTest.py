import unittest
import time

from p001 import P001
from p002 import P002
from p003 import P003
from p004 import P004
from p005 import P005
from p006 import P006
from p007 import P007
from p008 import P008
from p009 import P009
from p010 import P010
from p011 import P011
from p012 import P012
from p013 import P013
from p014 import P014
from p015 import P015
from p016 import P016
from p017 import P017
from p018 import P018
from p019 import P019
from p020 import P020
from p021 import P021
from p022 import P022
from p023 import P023

class AllSolutionsTest(unittest.TestCase):

    MAX_TIME = 60.0

    def solve_and_test(self, expected_result, problem):
        
        start_time = time.time()
        result = problem.solve()
        total_time = time.time() - start_time

        self.assertEqual(expected_result, result)
        self.assertTrue(total_time < self.MAX_TIME)

        print('p{0:03d}:'.format(problem.problem_number), result, '->', total_time, 's')

    def test_p001(self):
        expected_result = 233168
        self.solve_and_test(expected_result, P001())
        
    def test_p002(self):
        expected_result = 4613732
        self.solve_and_test(expected_result, P002())
        
    def test_p003(self):
        expected_result = 6857
        self.solve_and_test(expected_result, P003())
        
    def test_p004(self):
        expected_result = 906609
        self.solve_and_test(expected_result, P004())
        
    def test_p005(self):
        expected_result = 232792560
        self.solve_and_test(expected_result, P005())
        
    def test_p006(self):
        expected_result = 25164150
        self.solve_and_test(expected_result, P006())
        
    def test_p007(self):
        expected_result = 104743
        self.solve_and_test(expected_result, P007())
        
    def test_p008(self):
        expected_result = 23514624000
        self.solve_and_test(expected_result, P008())
        
    def test_p009(self):
        expected_result = 31875000
        self.solve_and_test(expected_result, P009())
        
    def test_p010(self):
        expected_result = 142913828922
        self.solve_and_test(expected_result, P010())
        
    def test_p011(self):
        expected_result = 70600674
        self.solve_and_test(expected_result, P011())
        
    def test_p012(self):
        expected_result = 76576500
        self.solve_and_test(expected_result, P012())
        
    def test_p013(self):
        expected_result = 5537376230
        self.solve_and_test(expected_result, P013())
        
    def test_p014(self):
        expected_result = 837799
        self.solve_and_test(expected_result, P014())
        
    def test_p015(self):
        expected_result = 137846528820
        self.solve_and_test(expected_result, P015())
        
    def test_p016(self):
        expected_result = 1366
        self.solve_and_test(expected_result, P016())
        
    def test_p017(self):
        expected_result = 21124
        self.solve_and_test(expected_result, P017())
        
    def test_p018(self):
        expected_result = 1074
        self.solve_and_test(expected_result, P018())
        
    def test_p019(self):
        expected_result = 171
        self.solve_and_test(expected_result, P019())
        
    def test_p020(self):
        expected_result = 648
        self.solve_and_test(expected_result, P020())
        
    def test_p021(self):
        expected_result = 31626
        self.solve_and_test(expected_result, P021())

    def test_p022(self):
        expected_result = 871198282
        self.solve_and_test(expected_result, P022())

    def test_p023(self):
        expected_result = 4179871
        self.solve_and_test(expected_result, P023())
    

if __name__ == '__main__':
    unittest.main()
