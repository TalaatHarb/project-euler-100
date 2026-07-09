package main

import "math/big"

var p020Cache = map[int]*big.Int{0: big.NewInt(1)}

func p020Factorial(n int) *big.Int {
	if v, ok := p020Cache[n]; ok {
		return v
	}
	data := new(big.Int).Mul(big.NewInt(int64(n)), p020Factorial(n-1))
	p020Cache[n] = data
	return data
}

/*P020Solve solution for p020*/
func P020Solve() int {
	n := 100
	result := 0
	for _, ch := range p020Factorial(n).String() {
		result += int(ch - '0')
	}
	return result
}
