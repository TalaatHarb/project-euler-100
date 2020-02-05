export class P010 {
    run() {
        const startTime = +new Date();
        let result = 0;

        const endTime = +new Date();
        const period = (endTime - startTime) / 1000.0;
        console.log("p010: " + result + " -> " + period + " s");
    }
}

// new P010().run();