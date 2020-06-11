package main

import "math"

func isPrimeP007(number int) bool {
	if number%2 == 0 {
		return false
	}
	upperLimit := int(math.Floor(math.Sqrt(float64(number))))
	if upperLimit%2 == 0 {
		upperLimit--
	}
	for i := int(upperLimit); i > 1; i -= 2 {
		if number%i == 0 {
			return false
		}
	}
	return true
}

/*P007Solve solution for p007*/
func P007Solve() int {
	target := 10001
	counter := 1
	current := 0

	for i := 1; counter <= target; i += 2 {
		if isPrimeP007(i) {
			current = i
			counter++
		}
	}

	return current
}
