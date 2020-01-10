max = 4000000
previous = 1
current = 2
sequence = []

sequence.append(previous)
sequence.append(current)

while current < max:
	next = previous + current
	if next < max:
		sequence.append(next)
	previous = current
	current = next

print(sequence)
print('Length of sequence:', len(sequence))

sum = 0
for number in sequence:
	if number % 2 == 0:
		sum = sum + number

print(sum)