package main

func p024StringPermutation(n int, str string) string {
	// Convert to 0-indexed
	n = n - 1

	// Build factoradic representation
	stack := make([]int, 0, len(str))
	for i := 1; i <= len(str); i++ {
		stack = append(stack, n%i)
		n = n / i
	}

	result := make([]byte, 0, len(str))
	s := []byte(str)
	for len(stack) > 0 {
		a := stack[len(stack)-1]
		stack = stack[:len(stack)-1]
		result = append(result, s[a])
		// Remove s[a] from s
		s = append(s[:a], s[a+1:]...)
	}
	return string(result)
}

/*P024Solve solution for p024*/
func P024Solve() int {
	n := 1000000
	data := "0123456789"
	result := 0
	for _, ch := range p024StringPermutation(n, data) {
		result = result*10 + int(ch-'0')
	}
	return result
}
