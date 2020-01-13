export class P001 {
    run() {
        const startTime = +new Date();
        const last = 1000;
        let sum = 0;

        for (let i = 1; i < last; i++) {
            if ((i % 3 == 0) || (i % 5 == 0)) {
                sum = sum + i;
            }
        }

        const endTime = +new Date();
        const period = (endTime - startTime) / 1000.0;
        console.log("p001: " + sum + " -> " + period + " s");
    }
}

// new P001().run();