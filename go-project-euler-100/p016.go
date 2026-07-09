package main

import "math/big"

/*P016Solve solution for p016*/
func P016Solve() int {
	n := 1000
	power := new(big.Int).Exp(big.NewInt(2), big.NewInt(int64(n)), nil)
	result := 0
	for _, ch := range power.String() {
		result += int(ch - '0')
	}
	return result
}
