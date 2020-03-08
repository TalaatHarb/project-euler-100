import { Solution } from "./Solution";

export class P001 extends Solution{
    solve() {
        this.problemNumber = 1;
        const last = 1000;
        let sum = 0;

        for (let i = 1; i < last; i++) {
            if ((i % 3 == 0) || (i % 5 == 0)) {
                sum = sum + i;
            }
        }
        return sum;
    }
}
