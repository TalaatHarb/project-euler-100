package main

import (
	"fmt"
	"time"
)

/*P003Run Entry point*/
func P003Run() {
	const NS = 1.0e9
	startTime := time.Now()
	result := 0

	period := (time.Since(startTime).Nanoseconds()) / NS
	fmt.Println("p003:", result, "->", period, "s")
}
