def is_palindromic(number):
    number_as_string = str(number)
    reverse = number_as_string[::-1]
    if reverse == number_as_string:
        return True
    else:
        return False

def run():
    start = 99
    finish = 999
    result = 0
    not_done = True
    i = finish
    while not_done and (i > start):
        for j in range(finish, start, -1):
            number = i * j
            if is_palindromic(number) and (number > result):
                result = number
                break
        i -= 1
    print('p004:', result)

run()