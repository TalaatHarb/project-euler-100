package main

/*P019Solve solution for p019*/
func P019Solve() int {
	result := 0

	// Day of week: 0=Sunday, 1=Monday, ..., 6=Saturday
	// Jan 1, 1900 was a Monday (day=1)
	daysInMonth := func(month, year int) int {
		switch month {
		case 4, 6, 9, 11:
			return 30
		case 2:
			if (year%4 == 0 && year%100 != 0) || year%400 == 0 {
				return 29
			}
			return 28
		default:
			return 31
		}
	}

	// Start from Jan 1, 1900 (Monday = day 1)
	day := 1
	for year := 1900; year <= 2000; year++ {
		for month := 1; month <= 12; month++ {
			if year >= 1901 && day == 0 {
				result++
			}
			day = (day + daysInMonth(month, year)) % 7
		}
	}

	return result
}
