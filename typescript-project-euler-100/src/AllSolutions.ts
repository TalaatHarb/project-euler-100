import { P001 } from './p001';
import { P002 } from './p002';
import { P003 } from './p003';
import { P004 } from './p004';
import { P005 } from './p005';
import { P006 } from './p006';
import { P007 } from './p007';
import { P008 } from './p008';
import { P009 } from './p009';
import { P010 } from './p010';

function solveSequential(): void {
    new P001().run();
    new P002().run();
    new P003().run();
    new P004().run();
    new P005().run();
    new P006().run();
    new P007().run();
    new P008().run();
    new P009().run();
    new P010().run();
}

async function solveParallel(): Promise<void> {
    await Promise.all([
        (async () => new P001().run())(),
        (async () => new P002().run())(),
        (async () => new P003().run())(),
        (async () => new P004().run())(),
        (async () => new P005().run())(),
        (async () => new P006().run())(),
        (async () => new P007().run())(),
        (async () => new P008().run())(),
        (async () => new P009().run())(),
        (async () => new P010().run())(),
    ]);
}
const args = process.argv.slice(2)

const startTime = +new Date();

if (args.length > 0 && args[0] === '-p') {
    solveParallel();
} else {
    solveSequential();
}

const endTime = +new Date();
const period = (endTime - startTime) / 1000.0;
console.log("Total time: " + period + " s");