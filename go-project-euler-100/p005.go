package main

import (
	"fmt"
	"time"
)

/*P005Solve solution*/
func P005Solve() int{
	result := 0

	return result
}

/*P005Run Entry point*/
func P005Run() {
	const NS = 1.0e9
	startTime := time.Now()

	result := P005Solve()

	period := (time.Since(startTime).Nanoseconds()) / NS
	fmt.Println("p005:", result, "->", period, "s")
}
