export class P009 {
    run() {
        const startTime = +new Date();
        let result = 0;

        const endTime = +new Date();
        const period = (endTime - startTime) / 1000.0;
        console.log("p009: " + result + " -> " + period + " s");
    }
}

// new P009().run();