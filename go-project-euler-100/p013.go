package main

import (
	_ "embed"
	"math/big"
	"strconv"
	"strings"
)

//go:embed p013.txt
var p013Data string

/*P013Solve solution for p013*/
func P013Solve() int {
	sum := big.NewInt(0)
	lines := strings.Split(strings.TrimSpace(p013Data), "\n")
	for _, line := range lines {
		n := new(big.Int)
		n.SetString(strings.TrimSpace(line), 10)
		sum.Add(sum, n)
	}
	result, _ := strconv.ParseInt(sum.String()[:10], 10, 64)
	return int(result)
}
