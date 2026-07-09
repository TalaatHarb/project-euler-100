package main

import "math/big"

var p025Cache = map[int]*big.Int{
	1: big.NewInt(1),
	2: big.NewInt(1),
}

func p025Fib(n int) *big.Int {
	if v, ok := p025Cache[n]; ok {
		return v
	}
	result := new(big.Int).Add(p025Fib(n-2), p025Fib(n-1))
	p025Cache[n] = result
	return result
}

/*P025Solve solution for p025*/
func P025Solve() int {
	target := 1000
	i := 3
	for len(p025Fib(i).String()) < target {
		i++
	}
	return i
}
