package main

import (
	_ "embed"
	"strconv"
	"strings"
)

//go:embed p011.txt
var p011Data string

func p011GridProduct(grid [][]int, i, j, count int) int {
	n := len(grid)
	maxProduct := 1

	product := 1
	if count <= n-i {
		for k := i; k < i+count; k++ {
			product *= grid[j][k]
		}
		if product > maxProduct {
			maxProduct = product
		}
	}

	product = 1
	if count <= n-j {
		for k := j; k < j+count; k++ {
			product *= grid[k][i]
		}
		if product > maxProduct {
			maxProduct = product
		}
	}

	product = 1
	if count <= n-i && count <= n-j {
		for k := 0; k < count; k++ {
			product *= grid[j+k][i+k]
		}
		if product > maxProduct {
			maxProduct = product
		}
	}

	product = 1
	if count <= n-i && j > count-1 {
		for k := 0; k < count; k++ {
			product *= grid[j-k][i+k]
		}
		if product > maxProduct {
			maxProduct = product
		}
	}

	return maxProduct
}

/*P011Solve solution for p011*/
func P011Solve() int {
	lines := strings.Split(strings.TrimSpace(p011Data), "\n")
	grid := make([][]int, len(lines))
	for i, line := range lines {
		parts := strings.Fields(line)
		row := make([]int, len(parts))
		for j, p := range parts {
			row[j], _ = strconv.Atoi(p)
		}
		grid[i] = row
	}

	maxProduct := 1
	count := 4
	n := len(grid)
	for i := 0; i < n; i++ {
		for j := 0; j < n; j++ {
			product := p011GridProduct(grid, i, j, count)
			if product > maxProduct {
				maxProduct = product
			}
		}
	}

	return maxProduct
}
