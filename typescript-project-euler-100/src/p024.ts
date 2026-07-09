import { Solution } from "./Solution";

export class P024 extends Solution {

	factorial(n: number): number {
		let result = 1;
		for (let i = 2; i <= n; i++) {
			result *= i;
		}
		return result;
	}

	stringPermutation(n: number, data: string): string {
		let index = n - 1;
		const available = data.split("");
		let result = "";

		for (let i = available.length; i > 0; i--) {
			const fact = this.factorial(i - 1);
			const selectedIndex = Math.floor(index / fact);
			result += available[selectedIndex];
			available.splice(selectedIndex, 1);
			index = index % fact;
		}

		return result;
	}

    solve() {
        this.problemNumber = 24;
		const n = 1000000;
		const data = "0123456789";
		const result = Number(this.stringPermutation(n, data));

		return result;
    }
}
