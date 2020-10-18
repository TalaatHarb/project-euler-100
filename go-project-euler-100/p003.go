package main

import (
	"math"
)

func isPrimeP003(number int) bool {
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

/*P003Solve solution for p003*/
func P003Solve() int {
	const number = 600851475143

	upperLimit := int(math.Floor(math.Sqrt(float64(number))))
	if upperLimit%2 == 0 {
		upperLimit--
	}
	possibleFactor := upperLimit
	result := number
	for possibleFactor > 1 {
		if (number%possibleFactor == 0) && isPrimeP003(possibleFactor) {
			result = possibleFactor
			break
		}
		possibleFactor -= 2
	}

	return result
}
