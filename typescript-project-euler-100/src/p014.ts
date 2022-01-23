import { Solution } from "./Solution";

export class P014 extends Solution{

    memoryCache: Map<number, number> = new Map<number, number>();

    constructor(){
        super();
        this.memoryCache.set(1, 1);
    }

    collatz(n: number): number {

		if (this.memoryCache.has(n)) {
			return this.memoryCache.get(n) as number;
		}

		if (n % 2 == 0) {
			const data = this.collatz(n / 2) + 1;
			this.memoryCache.set(n, data);
			return data;
		} else {
			const data = this.collatz(3 * n + 1) + 1;
			this.memoryCache.set(n, data);
			return data;
		}
	}

    solve() {
        this.problemNumber = 14;
        let maxNumber = 1;
		let maxLength = 0;
		const last = 1000000;

		for (let i = 2; i < last; i++) {
			const sequenceLength = this.collatz(i);
			if (sequenceLength > maxLength) {
				maxLength = sequenceLength;
				maxNumber = i;
			}
		}

		return maxNumber;
    }
}
