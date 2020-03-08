import { Solution } from "./Solution";

export class P010 extends Solution{

    sieveOfEratosthenes(n: number) {
		/**
		 * Create a boolean array "prime[0..n]" and initialize all entries in it as
		 * true. A value in prime[i] will finally be false if i is not a prime, else
		 * true.
		 */
        const prime: boolean[] = [];
        for (let i = 0; i < n; i++) {
            prime.push(true);
        }

        let p = 2;
        while (p * p <= n) {

            // If prime[p] is not changed, then it is a prime
            if (prime[p]) {
                // Update all multiples of p
                for (let i = (p * 2); i < n; i += p) {
                    prime[i] = false;
                }
            }
            p += 1;
        }
        prime[0] = false;
        prime[1] = false;

        const listOfPrimes: number[] = [];
        for (let i = 0; i < n; i++) {
            if (prime[i]) {
                listOfPrimes.push(i);
            }
        }

        return listOfPrimes;
    }

    solve() {
        this.problemNumber = 10;
        const last = 2000000;
        let sum: number = 0;
        const listOfPrimes = this.sieveOfEratosthenes(last);
        for (let i = 0; i < listOfPrimes.length; i++) {
            sum += listOfPrimes[i];
        }

        return sum;
    }
}
