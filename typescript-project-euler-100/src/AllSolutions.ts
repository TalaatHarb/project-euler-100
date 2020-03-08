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

const startTime = +new Date();

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

const endTime = +new Date();
const period = (endTime - startTime) / 1000.0;
console.log("Total time: " + period + " s");