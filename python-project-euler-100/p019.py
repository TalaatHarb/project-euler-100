import time
import datetime


def run():
    start_time = time.time()
    result = 0
    first_day = datetime.date(1900,1,1)
    delta = datetime.timedelta(days=6)
    first_sunday = first_day + delta
    delta = datetime.timedelta(days=7)
    current = first_sunday
    last_day = datetime.date(2000,1,1)
    while (last_day - current).days > 0:
        current = current + delta
        if (current.day == 1):
            print(current)
            result += 1
    
    total_time = time.time() - start_time
    print('p019:', result, '->', total_time, 's')

run()
