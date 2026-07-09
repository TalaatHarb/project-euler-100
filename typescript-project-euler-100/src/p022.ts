import { readFileSync } from "fs";
import { Solution } from "./Solution";

export class P022 extends Solution {

	readNames(fileName: string): string[] {
		const data = readFileSync(fileName, "utf-8");
		const names = data.split(",").map(part => part.slice(1, -1));
		names.sort();
		return names;
	}

	calculateNameValue(name: string): number {
		let value = 0;
		for (const letter of name) {
			value += letter.charCodeAt(0) - "A".charCodeAt(0) + 1;
		}
		return value;
	}

    solve() {
        this.problemNumber = 22;
		const names = this.readNames("p022.txt");
		let result = 0;
		for (let i = 0; i < names.length; i++) {
			result += this.calculateNameValue(names[i]) * (i + 1);
		}

		return result;
    }
}
