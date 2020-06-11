package main

/*P001Solve solution for p001*/
func P001Solve() int {
	sum := 0
	last := 1000
	for i := 1; i < last; i++ {
		if (i%3 == 0) || (i%5 == 0) {
			sum += i
		}
	}
	return sum
}
