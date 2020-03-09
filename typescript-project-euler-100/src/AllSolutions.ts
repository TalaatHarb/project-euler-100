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
import { P011 } from './p011';
import { P012 } from './p012';
import { P013 } from './p013';
import { P014 } from './p014';
import { P015 } from './p015';

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
    new P011().run();
    new P012().run();
    new P013().run();
    new P014().run();
    new P015().run();
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
        (async () => new P011().run())(),
        (async () => new P012().run())(),
        (async () => new P013().run())(),
        (async () => new P014().run())(),
        (async () => new P015().run())(),
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