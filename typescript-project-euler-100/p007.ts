export class P007 {
    run() {
        const startTime = +new Date();
        let result = 0;

        const endTime = +new Date();
        const period = (endTime - startTime) / 1000.0;
        console.log("P007: " + result + " -> " + period + " s");
    }
}

// new P007().run();