package main

func p023SumOfDivisors(n int) int {
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

/*P023Solve solution for p023*/
func P023Solve() int {
	limit := 28123
	abundant := make([]int, 0)
	for i := 1; i <= limit; i++ {
		if p023SumOfDivisors(i) > i {
			abundant = append(abundant, i)
		}
	}

	sumOfAbundant := make([]bool, limit+1)
	for _, a := range abundant {
		for _, b := range abundant {
			s := a + b
			if s <= limit {
				sumOfAbundant[s] = true
			} else {
				break
			}
		}
	}

	result := 0
	for i := 0; i <= limit; i++ {
		if !sumOfAbundant[i] {
			result += i
		}
	}
	return result
}
