package main

/*P005Solve solution for p005*/
func P005Solve() int {
	const last = 20
	var sequence []int = make([]int, 0, 19)
	result := 1
	number := 2
	counter := number
	for counter <= last {
		var i, j int
		for i = 0; i < len(sequence); i++ {
			j = sequence[i]
			if number%j == 0 {
				number = number / j
			}
		}

		result *= number
		sequence = append(sequence, number)
		counter++
		number = counter
	}
	return result
}
