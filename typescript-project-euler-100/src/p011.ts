import { Solution } from "./Solution";
import { readFileSync } from 'fs';

export class P011 extends Solution{

    readGrid(fileName: string): number[][]{
		const file = readFileSync(fileName, 'utf-8');
		const lines = file.split('\n');
        const grid: number[][] = new Array<number[]>(lines.length);
        for(let i = 0; i < lines.length; i++){
            const line = lines[i];
            const parts = line.split(' ');
            grid[i] = new Array<number>(parts.length);
            for(let j = 0; j < parts.length; j++){
                const part = parts[j];
                grid[i][j] = parseInt(part, 10);
            }
        }
		return grid;
    }

    gridProduct(grid: number[][], i: number, j: number, count: number): number{
        const n = grid.length;
		let maxProduct = 1;

		let product = 1;
		if (count <= (n - i)) {
			for (let k = i; k < (i + count); k++) {
				product *= grid[j][k];
				if (product > maxProduct) {
					maxProduct = product;
				}
			}
		}

		product = 1;
		if (count <= (n - j)) {
			for (let k = j; k < (j + count); k++) {
				product *= grid[k][i];
				if (product > maxProduct) {
					maxProduct = product;
				}
			}
		}

		product = 1;
		if ((count <= (n - i)) && (count <= (n - j))) {
			for (let k = 0; k < count; k++) {
				product *= grid[j + k][i + k];
				if (product > maxProduct) {
					maxProduct = product;
				}
			}
		}

		product = 1;
		if ((count <= (n - i)) && (j > (count - 1))) {
			for (let k = 0; k < count; k++) {
				product *= grid[j - k][i + k];
				if (product > maxProduct) {
					maxProduct = product;
				}
			}
		}
		return maxProduct;
    }

    solve() {
        this.problemNumber = 11;
        let maxProduct = 1;
		let product = 1;
		const count = 4;
		const grid = this.readGrid('./p011.txt');

		const n = grid.length;
		for (let i = 0; i < n; i++) {
			for (let j = 0; j < n; j++) {
				product = this.gridProduct(grid, i, j, count);
				if (product > maxProduct) {
					maxProduct = product;
				}
			}
		}

		return maxProduct;
    }
}
