export class P006 {
    run() {
        const startTime = +new Date();
        let result = 0;
        const last = 100;
		let sum = 0;
		let sumOfSquares = 0;

		for (let i = 1; i < (last + 1); i++) {
			sum += i;
			sumOfSquares += (i * i);
		}
		result = (sum * sum) - sumOfSquares;
        const endTime = +new Date();
        const period = (endTime - startTime) / 1000.0;
        console.log("p006: " + result + " -> " + period + " s");
    }
}

// new P006().run();