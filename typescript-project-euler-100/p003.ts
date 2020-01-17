export class P003 {
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

	run() {
		const startTime = +new Date();

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

		const endTime = +new Date();
		const period = (endTime - startTime) / 1000.0;
		console.log("p003: " + result + " -> " + period + " s");
	}
}

// new P003().run();