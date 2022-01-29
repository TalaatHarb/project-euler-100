import { Solution } from "./Solution";

export class P016 extends Solution {

    solve() {
        this.problemNumber = 16;

		let result = 0;
		const n = 1000;
		const power = BigInt(Math.pow(2, n));
		const powerString = power.toString();
		for (const i of powerString.split('')) {
			result += Number(i);
		}

		return result;
    }
}
