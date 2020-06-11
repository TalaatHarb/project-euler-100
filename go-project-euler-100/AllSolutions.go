package main

import (
	"fmt"
	"time"
)

/*SolutionRun Entry point*/
func SolutionRun(solution func() int, name string) {
	const NS = 1.0e9
	startTime := time.Now()
	result := solution()
	period := float64(time.Since(startTime).Nanoseconds()) / float64(NS)
	fmt.Println(name, result, "->", period, "s")
}

func main() {
	const NS = 1.0e9
	startTime := time.Now()

	SolutionRun(P001Solve, "p001")
	SolutionRun(P002Solve, "p002")
	SolutionRun(P003Solve, "p003")
	SolutionRun(P004Solve, "p004")
	SolutionRun(P005Solve, "p005")
	SolutionRun(P006Solve, "p006")
	SolutionRun(P007Solve, "p007")
	SolutionRun(P008Solve, "p008")

	period := float64(time.Since(startTime).Nanoseconds()) / float64(NS)
	fmt.Println("Total time:", period, "s")
}
