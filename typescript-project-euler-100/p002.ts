export class P002 {

    run() {
        const startTime = +new Date();
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

        const endTime = +new Date();
        const period = (endTime - startTime) / 1000.0;
        console.log("p002: " + sum + " -> " + period + " s");
    }
}

// new P001().run();