import { Solution } from "./Solution";

export class P020 extends Solution {

	digitSum(data: string): number {
		let result = 0;
		for (const digit of data) {
			result += Number(digit);
		}
		return result;
	}

	factorial(n: number): bigint {
		let result = BigInt(1);
		for (let i = 2; i <= n; i++) {
			result *= BigInt(i);
		}
		return result;
	}

    solve() {
        this.problemNumber = 20;
		const n = 100;
		const result = this.digitSum(this.factorial(n).toString());

		return result;
    }
}
