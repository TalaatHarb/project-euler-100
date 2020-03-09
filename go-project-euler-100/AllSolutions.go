package main

import (
	"fmt"
	"time"
)

func main() {
	const NS = 1.0e9
	startTime := time.Now()

	P001Run()
	P002Run()
	P003Run()
	P004Run()
	P005Run()

	period := float64(time.Since(startTime).Nanoseconds()) / float64(NS)
	fmt.Println("Total time:", period, "s")
}
