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
	SolutionRun(P009Solve, "p009")
	SolutionRun(P010Solve, "p010")
	SolutionRun(P011Solve, "p011")
	SolutionRun(P012Solve, "p012")
	SolutionRun(P013Solve, "p013")
	SolutionRun(P014Solve, "p014")
	SolutionRun(P015Solve, "p015")
	SolutionRun(P016Solve, "p016")
	SolutionRun(P017Solve, "p017")
	SolutionRun(P018Solve, "p018")
	SolutionRun(P019Solve, "p019")
	SolutionRun(P020Solve, "p020")
	SolutionRun(P021Solve, "p021")
	SolutionRun(P022Solve, "p022")
	SolutionRun(P023Solve, "p023")
	SolutionRun(P024Solve, "p024")
	SolutionRun(P025Solve, "p025")

	period := float64(time.Since(startTime).Nanoseconds()) / float64(NS)
	fmt.Println("Total time:", period, "s")
}
