package main

import "math"

func sieveOfEratosthenes(n int) []int {
	expectedCapacity := int(math.Floor(math.Sqrt(float64(n))))
	notPrime := make([]bool, 0, n)
	for i := 0; i < n; i++ {
		notPrime = append(notPrime, false)
	}

	for p := 2; p*p <= n; p++ {

		// If notPrime[p] is not changed, then it is a notPrime
		if !notPrime[p] {
			// Update all multiples of p
			for i := (p * 2); i < n; i += p {
				notPrime[i] = true
			}
		}
	}
	notPrime[0] = true
	notPrime[1] = true

	listOfPrimes := make([]int, 0, expectedCapacity)
	for i := 0; i < n; i++ {
		if !notPrime[i] {
			listOfPrimes = append(listOfPrimes, i)
		}
	}

	return listOfPrimes
}

/*P010Solve solution for p010*/
func P010Solve() int {
	last := 2000000
	sum := 0
	listOfPrimes := sieveOfEratosthenes(last)
	for _, i := range listOfPrimes {
		sum += i
	}

	return sum
}
