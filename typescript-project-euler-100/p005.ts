export class P005 {
    run() {
        const startTime = +new Date();
        const last = 20;
		const sequence: number[] = [];
		let result = 1;
		let number = 2;
		let counter = number;
		while (counter <= last) {
            let i: number;
            let j: number;
			for (i = 0; i < sequence.length; i++) {
                j = sequence[i];
				if (number % j === 0) {
                    number = number / j;
				}
			}

			result *= number;
			sequence.push(number);
			counter += 1;
			number = counter;
		}

        const endTime = +new Date();
        const period = (endTime - startTime) / 1000.0;
        console.log("p005: " + result + " -> " + period + " s");
    }
}

// new P005().run();