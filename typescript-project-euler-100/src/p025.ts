import { Solution } from "./Solution";

export class P025 extends Solution {

    solve() {
        this.problemNumber = 25;
		const targetDigits = 1000;
		let fibonacciIndex = 2;
		let previousFibonacci = BigInt(1);
		let currentFibonacci = BigInt(1);

		while (currentFibonacci.toString().length < targetDigits) {
			const nextFibonacci = previousFibonacci + currentFibonacci;
			previousFibonacci = currentFibonacci;
			currentFibonacci = nextFibonacci;
			fibonacciIndex++;
		}

		return fibonacciIndex;
    }
}
