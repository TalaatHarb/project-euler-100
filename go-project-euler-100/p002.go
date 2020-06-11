package main

/*P002Solve solution for p002*/
func P002Solve() int {
	const max = 4000000
	previous := 1
	current := 2
	sum := current
	for current < max {
		next := previous + current
		if (next < max) && (next%2 == 0) {
			sum += next
		}
		previous = current
		current = next
	}
	return sum
}
