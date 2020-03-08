import { Solution } from "./Solution";

export class P007 extends Solution{

    isPrime(number: number) {
		if (number % 2 == 0) {
			return false;
		}
		let upperLimit = Math.floor(Math.sqrt(number));
		if (upperLimit % 2 == 0) {
			upperLimit--;
		}
		for (let i = upperLimit; i > 1; i -= 2) {
			if (number % i == 0) {
				return false;
			}
		}
		return true;
	}

    solve() {
        const target = 10001;
		let counter = 1;
		let current = 0;

		let i = 1;
		while (counter <= target) {
			if (this.isPrime(i)) {
				current = i;
				counter += 1;
			}
			i += 2;
		}

        return current;
    }
}
