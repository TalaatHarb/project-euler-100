package main

func numberOfDivisors(n int, primes []int) int {
	for _, p := range primes {
		if p == n {
			return 2
		}
		if p > n {
			break
		}
	}

	result := 1
	for _, p := range primes {
		num := 0
		for n%p == 0 {
			num++
			n /= p
		}
		if num > 0 {
			result *= (num + 1)
		}
		if p > n {
			break
		}
	}
	return result
}

/*P012Solve solution for p012*/
func P012Solve() int {
	max := 100000
	target := 500
	primes := sieveOfEratosthenes(max)

	i := 1
	for {
		tn := i * (i + 1) / 2
		n := numberOfDivisors(tn, primes)
		if n > target {
			return tn
		}
		i++
	}
}
