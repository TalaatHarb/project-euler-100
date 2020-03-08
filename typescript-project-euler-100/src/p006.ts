import { Solution } from "./Solution";

export class P006 extends Solution{
    solve() {
        let result = 0;
        const last = 100;
		let sum = 0;
		let sumOfSquares = 0;

		for (let i = 1; i < (last + 1); i++) {
			sum += i;
			sumOfSquares += (i * i);
		}
        result = (sum * sum) - sumOfSquares;
        
        return result;
    }
}
