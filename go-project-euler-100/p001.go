package main

import (
	"fmt"
	"time"
)

/*P001Solve solution*/
func P001Solve() int{
	sum := 0
	last := 1000
	for i := 1; i < last; i++ {
		if (i%3 == 0) || (i%5 == 0) {
			sum += i
		}
	}
	return sum
}

/*P001Run Entry point*/
func P001Run() {
	const NS = 1.0e9
	startTime := time.Now()
	result := P001Solve()
	period := float64(time.Since(startTime).Nanoseconds()) / float64(NS)
	fmt.Println("p001:", result, "->", period, "s")
}
