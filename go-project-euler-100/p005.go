package main

import (
	"fmt"
	"time"
)

/*P005Solve solution*/
func P005Solve() int{
	const last = 20
	var sequence []int = make([]int,0,1)
	result := 1
	number := 2
	counter := number
	for counter <= last {
		var i,j int
		for i = 0; i < len(sequence); i++ {
			j = sequence[i]
			if number % j == 0 {
				number = number / j
			}
		}

		result *= number
		sequence = append(sequence, number)
		counter++
		number = counter
	}
	return result
}

/*P005Run Entry point*/
func P005Run() {
	const NS = 1.0e9
	startTime := time.Now()

	result := P005Solve()

	period := float64(time.Since(startTime).Nanoseconds()) / float64(NS)
	fmt.Println("p005:", result, "->", period, "s")
}
