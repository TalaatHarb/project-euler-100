package main

import (
	"math"
)

/*P009Solve solution for p009*/
func P009Solve() int {
	targetSum := 1000
	product := 0
	for a := 1; a < (targetSum - 2); a++ {
		for b := a + 1; b < (targetSum - 1); b++ {
			sumOfSquares := a*a + b*b
			c := (math.Sqrt(float64(sumOfSquares)))
			sum := float64(a) + float64(b) + c
			if sum == float64(targetSum) {
				product = (a * b * int(c))
			}
		}
	}

	return product
}
