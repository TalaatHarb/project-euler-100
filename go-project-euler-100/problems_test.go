package main

import (
	"fmt"
	"testing"
	"time"
)

func test(solution func() int, name string, expected int, t *testing.T) {
	const NS = 1.0e9
	startTime := time.Now()
	result := solution()
	period := float64(time.Since(startTime).Nanoseconds()) / float64(NS)
	fmt.Println(name+":", result, "->", period, "s")
	if result != expected {
		t.Errorf("%s failed and gave %d instead of %d", name, result, expected)
	}
	if period >= 60 {
		t.Errorf("%s failed to give a solution in less than a minute", name)
	}
}

/*TestP001*/
func TestP001(t *testing.T) {
	const EXPECTED = 233168
	test(P001Solve, "p001", EXPECTED, t)
}

/*TestP002*/
func TestP002(t *testing.T) {
	const EXPECTED = 4613732
	test(P002Solve, "p002", EXPECTED, t)
}

/*TestP003*/
func TestP003(t *testing.T) {
	const EXPECTED = 6857
	test(P003Solve, "p003", EXPECTED, t)
}

/*TestP004*/
func TestP004(t *testing.T) {
	const EXPECTED = 906609
	test(P004Solve, "p004", EXPECTED, t)
}

/*TestP005*/
func TestP005(t *testing.T) {
	const EXPECTED = 232792560
	test(P005Solve, "p005", EXPECTED, t)
}

/*TestP006*/
func TestP006(t *testing.T) {
	const EXPECTED = 25164150
	test(P006Solve, "p006", EXPECTED, t)
}

/*TestP007*/
func TestP007(t *testing.T) {
	const EXPECTED = 104743
	test(P007Solve, "p007", EXPECTED, t)
}

/*TestP008*/
func TestP008(t *testing.T) {
	const EXPECTED = 23514624000
	test(P008Solve, "p008", EXPECTED, t)
}

/*TestP009*/
func xTestP009(t *testing.T) {
	const EXPECTED = 31875000
	test(P009Solve, "p009", EXPECTED, t)
}

/*TestP010*/
func xTestP010(t *testing.T) {
	const EXPECTED = 142913828922
	test(P010Solve, "p010", EXPECTED, t)
}
