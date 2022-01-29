import { Solution } from './Solution';
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
import { P016 } from './p016';
import { P017 } from './p017';
import { P018 } from './p018';
import { P019 } from './p019';
import { P020 } from './p020';
import { P021 } from './p021';
import { P022 } from './p022';
import { P023 } from './p023';
import { P024 } from './p024';
import { P025 } from './p025';

function getProblems(): Solution[] {
    const result: Solution[] = [];

    result.push(new P001());
    result.push(new P002());
    result.push(new P003());
    result.push(new P004());
    result.push(new P005());
    result.push(new P006());
    result.push(new P007());
    result.push(new P008());
    result.push(new P009());
    result.push(new P010());
    result.push(new P011());
    result.push(new P012());
    result.push(new P013());
    result.push(new P014());
    result.push(new P015());
    result.push(new P016());
    result.push(new P017());
    result.push(new P018());
    result.push(new P019());
    result.push(new P020());
    result.push(new P021());
    result.push(new P022());
    result.push(new P023());
    result.push(new P024());
    result.push(new P025());

    return result;
}

function solveSequential(problems: Solution[]): void {
    for(const problem of problems){
        problem.run();
    }
}

async function solveParallel(problems: Solution[]): Promise<void> {

    const jobs: Promise<void>[] = [];
    
    for(const problem of problems){
        jobs.push((async () => problem.run())());
    }
    
    await Promise.all(jobs);
}

const args = process.argv.slice(2)
const problems = getProblems();

const startTime = +new Date();

if (args.length > 0 && args[0] === '-p') {
    solveParallel(problems);
} else {
    solveSequential(problems);
}

const endTime = +new Date();
const period = (endTime - startTime) / 1000.0;
console.log("Total time: " + period + " s");