export class P003 {

    run() {
        const startTime = +new Date();
        
		let  maxPrime = -1;
		let  n = 600851475143;

		while (n % 2 == 0) {
			maxPrime = 2;

			// equivalent to n /= 2
			n >>= 1;
		}

		for (let i = 3; i <= Math.sqrt(n); i += 2) {
			while (n % i == 0) {
				maxPrime = i;
				n = n / i;
			}
		}
		if (n > 2) {
			maxPrime = n;
		}

        const endTime = +new Date();
        const period = (endTime - startTime) / 1000.0;
        console.log("p003: " + maxPrime + " -> " + period + " s");
    }
}

// new P003().run();