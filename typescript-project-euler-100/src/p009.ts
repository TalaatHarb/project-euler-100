import { Solution } from "./Solution";

export class P009 extends Solution{
    solve() {
		this.problemNumber = 9;
        const target_sum = 1000;
		let product = 0;
		for (let a = 1; a < (target_sum - 2); a++) {
			for (let b = a + 1; b < (target_sum - 1); b++) {
				const sumOfSquares = a * a + b * b;
				let c = (Math.sqrt(sumOfSquares));
				const sum = a + b + c;
				if (sum == target_sum) {
					c = Math.floor(c);
					product = (a * b * c);
				}
			}
		}

        return product;
    }
}
