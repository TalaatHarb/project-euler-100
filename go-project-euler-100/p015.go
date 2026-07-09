package main

import "math/big"

var p015Cache = map[int]*big.Int{0: big.NewInt(1)}

func p015Factorial(n int) *big.Int {
	if v, ok := p015Cache[n]; ok {
		return v
	}
	data := new(big.Int).Mul(big.NewInt(int64(n)), p015Factorial(n-1))
	p015Cache[n] = data
	return data
}

/*P015Solve solution for p015*/
func P015Solve() int {
	n := 20
	for i := 1; i < 2*n; i++ {
		p015Factorial(i)
	}
	result := new(big.Int).Div(
		p015Factorial(2*n),
		new(big.Int).Mul(p015Factorial(n), p015Factorial(n)),
	)
	return int(result.Int64())
}
