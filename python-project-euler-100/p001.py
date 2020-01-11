def run():
	last = 1000
	sum = 0

	for i in range(1,last):
		if (i % 3 == 0) or (i % 5 == 0):
			sum = sum + i

	print('p001:', sum)

run()