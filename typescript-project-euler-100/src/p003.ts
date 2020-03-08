import { Solution } from "./Solution";

export class P003 extends Solution{
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
		const number = 600851475143;

		let upperLimit = Math.floor(Math.sqrt(number));
		if (upperLimit % 2 == 0) {
			upperLimit--;
		}
		let possibleFactor = upperLimit;
		let result = number;
		while (possibleFactor > 1) {
			if ((number % possibleFactor == 0) && this.isPrime(possibleFactor)) {
				result = possibleFactor;
				break;
			}
			possibleFactor -= 2;
		}

		return result;
	}
}
