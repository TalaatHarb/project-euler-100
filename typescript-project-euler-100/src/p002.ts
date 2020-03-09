import { Solution } from "./Solution";

export class P002 extends Solution{

    solve() {
        this.problemNumber = 2;
        const max = 4000000;
        let previous = 1;
        let current = 2;
        let sum = current;

        while (current < max) {
            let next = previous + current;
            if ((next < max) && (next % 2 == 0))
                sum += next;
            previous = current;
            current = next;
        }

        return sum;
    }
}
