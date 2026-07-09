import { Solution } from "./Solution";

export class P023 extends Solution {

	sumOfDivisorCache: Map<number, number> = new Map<number, number>();

	sumOfDivisors(n: number): number {
		if (this.sumOfDivisorCache.has(n)) {
			return this.sumOfDivisorCache.get(n) as number;
		}

		if (n === 1) {
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

	isAbundant(n: number): boolean {
		return this.sumOfDivisors(n) > n;
	}

    solve() {
        this.problemNumber = 23;
		const n = 28123;
		const abundantNumbers: number[] = [];
		const sumOfAbundant: boolean[] = new Array<boolean>(n).fill(false);
		let result = 0;

		for (let i = 1; i <= n; i++) {
			if (this.isAbundant(i)) {
				abundantNumbers.push(i);
			}
		}

		for (let i = 0; i < abundantNumbers.length; i++) {
			if ((abundantNumbers[i] * 2) >= n) {
				break;
			}
			for (let j = i; j < abundantNumbers.length; j++) {
				const sum = abundantNumbers[i] + abundantNumbers[j];
				if (sum < n) {
					sumOfAbundant[sum] = true;
				} else {
					break;
				}
			}
		}

		for (let i = 0; i < n; i++) {
			if (!sumOfAbundant[i]) {
				result += i;
			}
		}

		return result;
    }
}
