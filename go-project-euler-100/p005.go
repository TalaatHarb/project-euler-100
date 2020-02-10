package main

import (
	"fmt"
	"time"
)

/*P005Run Entry point*/
func P005Run() {
	const NS = 1.0e9
	startTime := time.Now()
	result := 0

	period := (time.Since(startTime).Nanoseconds()) / NS
	fmt.Println("p005:", result, "->", period, "s")
}
