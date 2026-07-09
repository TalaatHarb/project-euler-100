package main

import (
	_ "embed"
	"sort"
	"strings"
)

//go:embed p022.txt
var p022Data string

func p022NameValue(name string) int {
	value := 0
	for _, ch := range name {
		value += int(ch-'A') + 1
	}
	return value
}

/*P022Solve solution for p022*/
func P022Solve() int {
	raw := strings.TrimSpace(p022Data)
	parts := strings.Split(raw, ",")
	names := make([]string, len(parts))
	for i, p := range parts {
		names[i] = strings.Trim(p, "\"")
	}
	sort.Strings(names)

	result := 0
	for i, name := range names {
		result += p022NameValue(name) * (i + 1)
	}
	return result
}
