package main

import "strconv"

var p017Words = map[int]string{
	1: "one", 2: "two", 3: "three", 4: "four", 5: "five",
	6: "six", 7: "seven", 8: "eight", 9: "nine", 10: "ten",
	11: "eleven", 12: "twelve", 13: "thirteen", 14: "fourteen", 15: "fifteen",
	16: "sixteen", 17: "seventeen", 18: "eighteen", 19: "nineteen",
	20: "twenty", 30: "thirty", 40: "forty", 50: "fifty",
	60: "sixty", 70: "seventy", 80: "eighty", 90: "ninety",
	1000: "one thousand",
}

func p017NumberAsLetters(n int) string {
	if v, ok := p017Words[n]; ok {
		return v
	}
	data := strconv.Itoa(n)
	if n < 100 {
		tens := 10 * int(data[0]-'0')
		ones := int(data[1] - '0')
		result := p017Words[tens] + "-" + p017Words[ones]
		p017Words[n] = result
		return result
	}
	if n < 1000 {
		hundreds := int(data[0] - '0')
		rest := n % 100
		if rest == 0 {
			result := p017Words[hundreds] + " hundred"
			p017Words[n] = result
			return result
		}
		result := p017Words[hundreds] + " hundred and " + p017NumberAsLetters(rest)
		p017Words[n] = result
		return result
	}
	return ""
}

func p017LengthOfString(s string) int {
	count := 0
	for _, ch := range s {
		if ch != ' ' && ch != '-' {
			count++
		}
	}
	return count
}

/*P017Solve solution for p017*/
func P017Solve() int {
	n := 1000
	result := 0
	for i := 1; i <= n; i++ {
		result += p017LengthOfString(p017NumberAsLetters(i))
	}
	return result
}
