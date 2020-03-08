package main

import (
	"fmt"
	"time"
)

/*P002Solve solution*/
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

/*P002Run Entry point*/
func P002Run() {
	const NS = 1.0e9
	startTime := time.Now()
	
	result := P002Solve()

	period := (time.Since(startTime).Nanoseconds()) / NS
	fmt.Println("p002:", result, "->", period, "s")
}
