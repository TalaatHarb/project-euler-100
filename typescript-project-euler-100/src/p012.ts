import { Solution } from "./Solution";

export class P012 extends Solution {
    solve() {
        this.problemNumber = 12;
        let result = 1;
		const max = 100000;
		const target = 500;
		const primes = this.sieveOfEratosthenes(max);
		let i = 1;
		while (result == 1) {
			const tn = this.triangularNumber(i);
			const n = this.numberOfDivisors(tn, primes);
			if (n > target) {
				result = tn;
			}
			i += 1;
		}

		return result;
    }

    triangularNumber(n: number): number {
        return (n * (n + 1) / 2);
    }

    numberOfDivisors(n: number, primes: number[]) {
        let result = 1;
        if (primes.includes(n)) {
            result = 2;
            return result;
        }
        for (const i of primes) {
            let num = 0;
            while (n % i == 0) {
                num += 1;
                n /= i;
            }

            if (num > 0) {
                result *= (num + 1);
            }
            if (i > n) {
                break;
            }
        }
        return result;
    }

    sieveOfEratosthenes(n: number): number[] {
        /**
         * Create a boolean array "notPrime[0..n]" and initialize all entries in it as
         * false. A value in notPrime[i] will finally be true if i is not a prime, else
         * false.
         */
        const notPrime: boolean[] = new Array(n);

        let p = 2;
        while (p * p <= n) {

            // If notPrime[p] is not changed, then it is a notPrime
            if (!notPrime[p]) {
                // Update all multiples of p
                for (let i = (p * 2); i < n; i += p) {
                    notPrime[i] = true;
                }
            }
            p += 1;
        }
        notPrime[0] = true;
        notPrime[1] = true;

        const listOfPrimes: number[] = [];
        for (let i = 0; i < n; i++) {
            if (!notPrime[i]) {
                listOfPrimes.push(i);
            }
        }

        return listOfPrimes;
    }
}
