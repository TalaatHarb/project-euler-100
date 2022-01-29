import { Solution } from "./Solution";

export class P017 extends Solution {

    memoryCache: Map<number, string> = new Map<number, string>();

    constructor() {
        super();

        this.memoryCache.set(1, "one");
        this.memoryCache.set(2, "two");
        this.memoryCache.set(3, "three");
        this.memoryCache.set(4, "four");
        this.memoryCache.set(5, "five");
        this.memoryCache.set(6, "six");
        this.memoryCache.set(7, "seven");
        this.memoryCache.set(8, "eight");
        this.memoryCache.set(9, "nine");
        this.memoryCache.set(10, "ten");
        this.memoryCache.set(11, "eleven");
        this.memoryCache.set(12, "twelve");
        this.memoryCache.set(13, "thirteen");
        this.memoryCache.set(14, "fourteen");
        this.memoryCache.set(15, "fifteen");
        this.memoryCache.set(16, "sixteen");
        this.memoryCache.set(17, "seventeen");
        this.memoryCache.set(18, "eighteen");
        this.memoryCache.set(19, "nineteen");
        this.memoryCache.set(20, "twenty");
        this.memoryCache.set(30, "thirty");
        this.memoryCache.set(40, "forty");
        this.memoryCache.set(50, "fifty");
        this.memoryCache.set(60, "sixty");
        this.memoryCache.set(70, "seventy");
        this.memoryCache.set(80, "eighty");
        this.memoryCache.set(90, "ninety");
        this.memoryCache.set(1000, "one thousand");
    }

    lengthOfString(data: string): number {
        return data.replace(/ /g, "").replace("-", "").length;
    }

    numberAsLetters(n: number): string {
        if (this.memoryCache.has(n)) {
            return this.memoryCache.get(n) as string;
        }

        const data = n + "";
        if (n < 100) {
            this.memoryCache.set(n, this.memoryCache.get(10 * Number(data.charAt(0))) + '-'
                + (this.memoryCache.get(Number(data.charAt(1)))) as string);
        }

        if ((n < 1000) && (n >= 100)) {
            if (n % 100 == 0) {
                this.memoryCache.set(n, this.memoryCache.get(Number(data.charAt(0))) + " hundred");
            } else {
                this.memoryCache.set(n, this.memoryCache.get(Number(data.charAt(0))) + " hundred and "
                    + (this.numberAsLetters(Number(data.substring(1, 3)))));
            }
        }

        return this.memoryCache.get(n) as string;
    }

    solve() {
        this.problemNumber = 17;

        let result = 0;
        const n = 1000;
        for (let i = 1; i < (n + 1); i++) {
            const data = this.numberAsLetters(i);
            result += this.lengthOfString(data);
        }

        return result;
    }
}
