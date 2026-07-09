import { Solution } from "./Solution";

export class P019 extends Solution {

    solve() {
        this.problemNumber = 19;

		let result = 0;
		for (let year = 1901; year <= 2000; year++) {
			for (let month = 0; month < 12; month++) {
				const date = new Date(year, month, 1);
				if (date.getDay() === 0) {
					result++;
				}
			}
		}

		return result;
    }
}
