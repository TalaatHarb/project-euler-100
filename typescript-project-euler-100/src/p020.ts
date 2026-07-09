import { Solution } from "./Solution";

export class P020 extends Solution {

	memoryCache: Map<number, bigint> = new Map<number, bigint>();

	constructor() {
		super();
		this.memoryCache.set(0, 1n);
	}

	digitSum(data: string): number {
		let result = 0;
		for (const digit of data) {
			result += Number(digit);
		}
		return result;
	}

	factorial(n: number): bigint {
		if (this.memoryCache.has(n)) {
			return this.memoryCache.get(n) as bigint;
		}
		const value = BigInt(n) * this.factorial(n - 1);
		this.memoryCache.set(n, value);
		return value;
	}

    solve() {
        this.problemNumber = 20;
		const n = 100;
		const result = this.digitSum(this.factorial(n).toString());

		return result;
    }
}
