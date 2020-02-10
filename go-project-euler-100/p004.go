package main

import (
	"fmt"
	"time"
)

/*P004Run Entry point*/
func P004Run() {
	const NS = 1.0e9
	startTime := time.Now()
	result := 0

	period := (time.Since(startTime).Nanoseconds()) / NS
	fmt.Println("p004:", result, "->", period, "s")
}
