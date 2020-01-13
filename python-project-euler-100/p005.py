import time

def run():
    start_time = time.time()
    last = 20
    sequence = []
    result = 1
    number = 2
    counter = number
    while(counter <= last):
        for i in sequence:
            if number % i == 0:
                number //= i
        result *= number
        sequence.append(number)
        counter += 1
        number = counter
    
    total_time = time.time() - start_time
    print('p005:', result, '->', total_time, 's')

run()