package main

import (
	"fmt"
	"time"
)

/*P002Run Entry point*/
func P002Run() {
	const NS = 1.0e9
	startTime := time.Now()
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

	period := (time.Since(startTime).Nanoseconds()) / NS
	fmt.Println("p002:", sum, "->", period, "s")
}
