import { Solution } from "./Solution";

export class P004 extends Solution{

	solve() {
		this.problemNumber = 4;
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

		return result;
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
