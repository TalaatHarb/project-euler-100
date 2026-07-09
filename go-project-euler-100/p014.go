package main

var p014Cache = map[int]int{1: 0}

func p014Collatz(n int) int {
	if v, ok := p014Cache[n]; ok {
		return v
	}
	var data int
	if n%2 == 0 {
		data = p014Collatz(n/2) + 1
	} else {
		data = p014Collatz(3*n+1) + 1
	}
	p014Cache[n] = data
	return data
}

/*P014Solve solution for p014*/
func P014Solve() int {
	maxNumber := 1
	maxLength := 0
	last := 1000000

	for i := 2; i < last; i++ {
		seqLen := p014Collatz(i)
		if seqLen > maxLength {
			maxLength = seqLen
			maxNumber = i
		}
	}

	return maxNumber
}
