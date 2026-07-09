package main

import (
	_ "embed"
	"strconv"
	"strings"
)

//go:embed p018.txt
var p018Data string

/*P018Solve solution for p018*/
func P018Solve() int {
	lines := strings.Split(strings.TrimSpace(p018Data), "\n")
	n := len(lines)
	triangle := make([][]int, n)
	for i, line := range lines {
		parts := strings.Fields(line)
		row := make([]int, len(parts))
		for j, p := range parts {
			row[j], _ = strconv.Atoi(p)
		}
		triangle[i] = row
	}

	// DP bottom-up
	for i := n - 2; i >= 0; i-- {
		for j := 0; j <= i; j++ {
			left := triangle[i+1][j]
			right := triangle[i+1][j+1]
			if left > right {
				triangle[i][j] += left
			} else {
				triangle[i][j] += right
			}
		}
	}

	return triangle[0][0]
}
