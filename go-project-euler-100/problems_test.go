package main

import "testing"

/*TestP001*/
func TestP001(t *testing.T) {
    result := P001Solve()
    const EXPECTED = 233168
    if result != EXPECTED {
        t.Errorf("p001 failed and gave %d instead of %d", result, EXPECTED)
    }
}

/*TestP002*/
func TestP002(t *testing.T) {
    result := P002Solve()
    const EXPECTED = 4613732
    if result != EXPECTED {
        t.Errorf("p002 failed and gave %d instead of %d", result, EXPECTED)
    }
}

/*TestP003*/
func TestP003(t *testing.T) {
    result := P003Solve()
    const EXPECTED = 6857
    if result != EXPECTED {
        t.Errorf("p003 failed and gave %d instead of %d", result, EXPECTED)
    }
}

/*TestP004*/
func TestP004(t *testing.T) {
    result := P004Solve()
    const EXPECTED = 906609
    if result != EXPECTED {
        t.Errorf("p004 failed and gave %d instead of %d", result, EXPECTED)
    }
}

/*TestP005*/
func TestP005(t *testing.T) {
    result := P005Solve()
    const EXPECTED = 232792560
    if result != EXPECTED {
        t.Errorf("p005 failed and gave %d instead of %d", result, EXPECTED)
    }
}