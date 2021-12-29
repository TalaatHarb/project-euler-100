import { Solution } from "./Solution";

export class P004 extends Solution{

	solve() {
		this.problemNumber = 4;
		const start = 99;
		const finish = 999;
		let result = 0;
		const notDone = true;
		let i = finish;

		while (notDone && (i > start)) {

			for (let j = finish; j > start; j--) {

				const num = i * j;
				if (num > result && this.isPalindromic(num)) {
					result = num;
					break;
				}
			}
			i--;

		}

		return result;
	}

	isPalindromic(number: number): boolean {
		let reverse = "";
		const numberAsString = number.toString();
		const length = numberAsString.length;
		for (let i = length - 1; i >= 0; i--)
			reverse = reverse + numberAsString.charAt(i);
		if (numberAsString == reverse)
			return true;
		else
			return false;
	}
}
