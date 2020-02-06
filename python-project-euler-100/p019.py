import time
import datetime

class P019:
    def run(self):
        start_time = time.time()
        result = 0
        first_day = datetime.date(1901,1,1)
        delta = datetime.timedelta(days=5)
        first_sunday = first_day + delta
        delta = datetime.timedelta(days=7)
        current = first_sunday
        last_day = datetime.date(2000,12,31)
        while (last_day - current).days > 0:
            current = current + delta
            if (current.day == 1):
                result += 1
        total_time = time.time() - start_time
        print('p019:', result, '->', total_time, 's')

def main():
	P019().run()

if __name__ == "__main__":
	main()
