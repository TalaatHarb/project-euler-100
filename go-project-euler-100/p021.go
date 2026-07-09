package main

func p021SumOfDivisors(n int) int {
	sum := 1
	for i := 2; i*i <= n; i++ {
		if n%i == 0 {
			sum += i
			if i != n/i {
				sum += n / i
			}
		}
	}
	return sum
}

func p021IsAmicable(a int) bool {
	b := p021SumOfDivisors(a)
	c := p021SumOfDivisors(b)
	return (a != b) && (a == c)
}

/*P021Solve solution for p021*/
func P021Solve() int {
	n := 10000
	result := 0
	for i := 1; i <= n; i++ {
		if p021IsAmicable(i) {
			result += i
		}
	}
	return result
}
