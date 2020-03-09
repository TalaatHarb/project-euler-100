package main

import (
    "testing"
    "time"
    "fmt"
)

/*TestP001*/
func TestP001(t *testing.T) {
    const NS = 1.0e9
	startTime := time.Now()
	result := P001Solve()
	period := (time.Since(startTime).Nanoseconds()) / NS
	fmt.Println("p001:", result, "->", period, "s")
    const EXPECTED = 233168
    if result != EXPECTED {
        t.Errorf("p001 failed and gave %d instead of %d", result, EXPECTED)
    }
    if period >= 60{
        t.Errorf("p001 failed to give a solution in less than a minute")
    }
}

/*TestP002*/
func TestP002(t *testing.T) {
    const NS = 1.0e9
	startTime := time.Now()
	result := P002Solve()
	period := (time.Since(startTime).Nanoseconds()) / NS
	fmt.Println("p002:", result, "->", period, "s")
    const EXPECTED = 4613732
    if result != EXPECTED {
        t.Errorf("p002 failed and gave %d instead of %d", result, EXPECTED)
    }
    if period >= 60{
        t.Errorf("p001 failed to give a solution in less than a minute")
    }
}

/*TestP003*/
func TestP003(t *testing.T) {
    const NS = 1.0e9
	startTime := time.Now()
	result := P003Solve()
	period := (time.Since(startTime).Nanoseconds()) / NS
	fmt.Println("p003:", result, "->", period, "s")
    const EXPECTED = 6857
    if result != EXPECTED {
        t.Errorf("p003 failed and gave %d instead of %d", result, EXPECTED)
    }
    if period >= 60{
        t.Errorf("p001 failed to give a solution in less than a minute")
    }
}

/*TestP004*/
func TestP004(t *testing.T) {
    const NS = 1.0e9
	startTime := time.Now()
	result := P004Solve()
	period := (time.Since(startTime).Nanoseconds()) / NS
	fmt.Println("p004:", result, "->", period, "s")
    const EXPECTED = 906609
    if result != EXPECTED {
        t.Errorf("p004 failed and gave %d instead of %d", result, EXPECTED)
    }
    if period >= 60{
        t.Errorf("p001 failed to give a solution in less than a minute")
    }
}

/*TestP005*/
func TestP005(t *testing.T) {
    const NS = 1.0e9
	startTime := time.Now()
	result := P005Solve()
	period := (time.Since(startTime).Nanoseconds()) / NS
	fmt.Println("p005:", result, "->", period, "s")
    const EXPECTED = 232792560
    if result != EXPECTED {
        t.Errorf("p005 failed and gave %d instead of %d", result, EXPECTED)
    }
    if period >= 60{
        t.Errorf("p001 failed to give a solution in less than a minute")
    }
}