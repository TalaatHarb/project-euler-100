import { Solution } from "./Solution";

export class P021 extends Solution {

	sumOfDivisorCache: Map<number, number> = new Map<number, number>();

	sumOfDivisors(n: number): number {
		if (this.sumOfDivisorCache.has(n)) {
			return this.sumOfDivisorCache.get(n) as number;
		}

		if (n <= 1) {
			return 0;
		}

		let result = 1;
		for (let i = 2; i * i <= n; i++) {
			if (n % i === 0) {
				result += i;
				const j = n / i;
				if (j !== i) {
					result += j;
				}
			}
		}
		this.sumOfDivisorCache.set(n, result);
		return result;
	}

	isAmicable(a: number): boolean {
		const b = this.sumOfDivisors(a);
		const c = this.sumOfDivisors(b);
		return (a !== b) && (a === c);
	}

    solve() {
        this.problemNumber = 21;
		const n = 10000;
		let result = 0;
		for (let i = 1; i <= n; i++) {
			if (this.isAmicable(i)) {
				result += i;
			}
		}

		return result;
    }
}
