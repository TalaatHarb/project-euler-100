import { Solution } from "./Solution";
import { readFileSync } from "fs";

export class P013 extends Solution{
    solve() {
        this.problemNumber = 13;
        let sum = BigInt(0);
		const numbers = this.readNumbers("p013.txt");

		for (const line of numbers) {
			sum += BigInt(line);
		}
		const result = (sum.toString()).substring(0, 10);

		return Number(result);
    }

    readNumbers(fileName: string): string[]{
        const file = readFileSync(fileName, 'utf-8');
        return file.split('\n');
    }
}
