package main

/*P006Solve solution for p006*/
func P006Solve() int {
	result := 0
	last := 100
	sum := 0
	sumOfSquares := 0

	for i := 1; i < last+1; i++ {
		sum += i
		sumOfSquares += (i * i)
	}
	result = (sum * sum) - sumOfSquares

	return result
}
