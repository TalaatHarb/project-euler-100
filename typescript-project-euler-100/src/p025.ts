import { Solution } from "./Solution";

export class P025 extends Solution {

	memoryCache: Map<number, bigint> = new Map<number, bigint>();

	constructor() {
		super();
		this.memoryCache.set(1, 1n);
		this.memoryCache.set(2, 1n);
	}

	fib(n: number): bigint {
		if (this.memoryCache.has(n)) {
			return this.memoryCache.get(n) as bigint;
		}
		const result = this.fib(n - 2) + this.fib(n - 1);
		this.memoryCache.set(n, result);
		return result;
	}

    solve() {
        this.problemNumber = 25;
		const digits = 1000;
		let i = 3;
		let value = this.fib(i);

		while (value.toString().length < digits) {
			i++;
			value = this.fib(i);
		}

		return i;
    }
}
