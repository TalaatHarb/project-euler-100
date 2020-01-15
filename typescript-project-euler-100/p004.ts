export class P004 {

	run() {
		const startTime = +new Date();
		let start = 99;
		let finish = 999;
		let result = 0;
		var notDone = true;
		let i = finish;

		while (notDone && (i > start)) {

			for (let j = finish; j > start; j--) {

				let number = i * j;
				if (number > result && this.isPalindromic(number)) {
					result = number;
					break;
				}
			}
			i--;

		}

		const endTime = +new Date();
		const period = (endTime - startTime) / 1000.0;
		console.log("p004: " + result + " -> " + period + " s");

	}
	isPalindromic(number: number): boolean {
		let reverse = "";
		let numberAsString = number.toString();
		let length = numberAsString.length;
		for (let i = length - 1; i >= 0; i--)
			reverse = reverse + numberAsString.charAt(i);
		if (numberAsString == reverse)
			return true;
		else
			return false;
	}
}

// new P004().run();