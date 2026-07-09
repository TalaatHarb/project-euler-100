import { Solution } from "./Solution";

export class P025 extends Solution {

    solve() {
        this.problemNumber = 25;
		const digits = 1000;
		let i = 2;
		let a = BigInt(1);
		let value = BigInt(1);

		while (value.toString().length < digits) {
			const next = a + value;
			a = value;
			value = next;
			i++;
		}

		return i;
    }
}
