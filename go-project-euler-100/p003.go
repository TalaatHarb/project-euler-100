package main

import (
	"fmt"
	"math"
	"time"
)

func isPrime(number int) bool {
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

/*P003Solve solution*/
func P003Solve() int{
	const number = 600851475143

	upperLimit := int(math.Floor(math.Sqrt(float64(number))))
	if upperLimit%2 == 0 {
		upperLimit--
	}
	possibleFactor := upperLimit
	result := number
	for possibleFactor > 1 {
		if (number%possibleFactor == 0) && isPrime(possibleFactor) {
			result = possibleFactor
			break
		}
		possibleFactor -= 2
	}

	return result
}

/*P003Run Entry point*/
func P003Run() {
	const NS = 1.0e9
	startTime := time.Now()
	
	result := P003Solve()

	period := float64(time.Since(startTime).Nanoseconds()) / float64(NS)
	fmt.Println("p003:", result, "->", period, "s")
}
