package main

import (
	"fmt"
	"time"
)

/*P001Run Entry point*/
func P001Run() {
	const NS = 1.0e9
	startTime := time.Now()
	sum := 0
	last := 1000
	for i := 1; i < last; i++ {
		if (i%3 == 0) || (i%5 == 0) {
			sum += i
		}
	}
	period := (time.Since(startTime).Nanoseconds()) / NS
	fmt.Println("p001:", sum, "->", period, "s")
}
