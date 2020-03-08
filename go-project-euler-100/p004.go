package main

import (
	"fmt"
	"strconv"
	"time"
)

func isPalindromic(number int) bool {
	numberAsString := strconv.Itoa(number)
	length := len(numberAsString)
	result := true
	j := 0
	for i := 0; i < length/2; i++ {
		j = length - i - 1
		if numberAsString[i] != numberAsString[j] {
			result = false
			break
		}
	}
	return result
}

/*P004Solve solution*/
func P004Solve() int{
	result := 0
	const finish = 999
	const start = 99
	i := finish

	for ; i > start; i-- {

		for j := finish; j > start; j-- {

			number := i * j
			if (number > result) && isPalindromic(number) {
				result = number
				break
			}
		}
	}
	
	return result
}

/*P004Run Entry point*/
func P004Run() {
	const NS = 1.0e9
	startTime := time.Now()
	
	result := P004Solve()

	period := (time.Since(startTime).Nanoseconds()) / NS
	fmt.Println("p004:", result, "->", period, "s")
}
