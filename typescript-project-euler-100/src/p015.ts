import { Solution } from "./Solution";

export class P015 extends Solution {

    memoryCache: Map<number, number> = new Map<number, number>();

    constructor() {
        super();
        this.memoryCache.set(0, 1);
    }

    factorial(n: number) : number{
		if (this.memoryCache.has(n)) {
			return this.memoryCache.get(n) as number;
		}
		const data = n * (this.factorial(n - 1));
		this.memoryCache.set(n, data);
		return data;
	}


    solve() {
        this.problemNumber = 15;
        const n = 20;

		for (let i = 1; i < (2 * n); i++) {
			this.factorial(i);
		}

		return this.factorial(2 * n) / ((this.factorial(n) * (this.factorial(n))));
    }
}
