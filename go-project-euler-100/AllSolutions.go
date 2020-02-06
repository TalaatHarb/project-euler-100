package main

import (
	"fmt"
	"time"
)

func main() {
	const NS = 1.0e9
	startTime := time.Now()

	P001Run()

	period := (time.Since(startTime).Nanoseconds()) / NS
	fmt.Println("Total time:", period, "s")
}
