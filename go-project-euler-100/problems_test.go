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
func TestP009(t *testing.T) {
	const EXPECTED = 31875000
	test(P009Solve, "p009", EXPECTED, t)
}

/*TestP010*/
func TestP010(t *testing.T) {
	const EXPECTED = 142913828922
	test(P010Solve, "p010", EXPECTED, t)
}

/*TestP011*/
func TestP011(t *testing.T) {
	const EXPECTED = 70600674
	test(P011Solve, "p011", EXPECTED, t)
}

/*TestP012*/
func TestP012(t *testing.T) {
	const EXPECTED = 76576500
	test(P012Solve, "p012", EXPECTED, t)
}

/*TestP013*/
func TestP013(t *testing.T) {
	const EXPECTED = 5537376230
	test(P013Solve, "p013", EXPECTED, t)
}

/*TestP014*/
func TestP014(t *testing.T) {
	const EXPECTED = 837799
	test(P014Solve, "p014", EXPECTED, t)
}

/*TestP015*/
func TestP015(t *testing.T) {
	const EXPECTED = 137846528820
	test(P015Solve, "p015", EXPECTED, t)
}

/*TestP016*/
func TestP016(t *testing.T) {
	const EXPECTED = 1366
	test(P016Solve, "p016", EXPECTED, t)
}

/*TestP017*/
func TestP017(t *testing.T) {
	const EXPECTED = 21124
	test(P017Solve, "p017", EXPECTED, t)
}

/*TestP018*/
func TestP018(t *testing.T) {
	const EXPECTED = 1074
	test(P018Solve, "p018", EXPECTED, t)
}

/*TestP019*/
func TestP019(t *testing.T) {
	const EXPECTED = 171
	test(P019Solve, "p019", EXPECTED, t)
}

/*TestP020*/
func TestP020(t *testing.T) {
	const EXPECTED = 648
	test(P020Solve, "p020", EXPECTED, t)
}

/*TestP021*/
func TestP021(t *testing.T) {
	const EXPECTED = 31626
	test(P021Solve, "p021", EXPECTED, t)
}

/*TestP022*/
func TestP022(t *testing.T) {
	const EXPECTED = 871198282
	test(P022Solve, "p022", EXPECTED, t)
}

/*TestP023*/
func TestP023(t *testing.T) {
	const EXPECTED = 4179871
	test(P023Solve, "p023", EXPECTED, t)
}

/*TestP024*/
func TestP024(t *testing.T) {
	const EXPECTED = 2783915460
	test(P024Solve, "p024", EXPECTED, t)
}

/*TestP025*/
func TestP025(t *testing.T) {
	const EXPECTED = 4782
	test(P025Solve, "p025", EXPECTED, t)
}
