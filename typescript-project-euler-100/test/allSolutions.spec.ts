import 'jasmine';
import { P001 } from '../src/p001';
import { P002 } from '../src/p002';
import { P003 } from '../src/p003';
import { P004 } from '../src/p004';
import { P005 } from '../src/p005';
import { P006 } from '../src/p006';
import { P007 } from '../src/p007';
import { P008 } from '../src/p008';
import { P009 } from '../src/p009';
import { P010 } from '../src/p010';
import { P011 } from '../src/p011';
import { Solution } from '../src/Solution';
import { P015 } from '../src/p015';
import { P014 } from '../src/p014';
import { P013 } from '../src/p013';
import { P012 } from '../src/p012';

describe('All solutions', () => {
    it('should solve p001', () => {
        const problem: Solution = new P001();
        const startTime = +new Date();

        const result = problem.solve();

        const endTime = +new Date();
        const period = (endTime - startTime) / 1000.0;
        console.log("p" + ('000' + problem.problemNumber).slice(-3) + ': ' + result + ' -> ' + period + ' s');
        
        expect(result).toBe(233168);
        expect(period).toBeLessThan(60);
    });

    it('should solve p002', () => {
        const problem: Solution = new P002();
        const startTime = +new Date();

        const result = problem.solve();

        const endTime = +new Date();
        const period = (endTime - startTime) / 1000.0;
        console.log("p" + ('000' + problem.problemNumber).slice(-3) + ': ' + result + ' -> ' + period + ' s');
        expect(result).toBe(4613732);
        expect(period).toBeLessThan(60);
    });

    it('should solve p003', () => {
        const problem: Solution = new P003();
        const startTime = +new Date();

        const result = problem.solve();

        const endTime = +new Date();
        const period = (endTime - startTime) / 1000.0;
        console.log("p" + ('000' + problem.problemNumber).slice(-3) + ': ' + result + ' -> ' + period + ' s');
        expect(result).toBe(6857);
        expect(period).toBeLessThan(60);
    });

    it('should solve p004', () => {
        const problem: Solution = new P004();
        const startTime = +new Date();

        const result = problem.solve();

        const endTime = +new Date();
        const period = (endTime - startTime) / 1000.0;
        console.log("p" + ('000' + problem.problemNumber).slice(-3) + ': ' + result + ' -> ' + period + ' s');
        expect(result).toBe(906609);
        expect(period).toBeLessThan(60);
    });

    it('should solve p005', () => {
        const problem: Solution = new P005();
        const startTime = +new Date();

        const result = problem.solve();

        const endTime = +new Date();
        const period = (endTime - startTime) / 1000.0;
        console.log("p" + ('000' + problem.problemNumber).slice(-3) + ': ' + result + ' -> ' + period + ' s');
        expect(result).toBe(232792560);
        expect(period).toBeLessThan(60);
    });

    it('should solve p006', () => {
        const problem: Solution = new P006();
        const startTime = +new Date();

        const result = problem.solve();

        const endTime = +new Date();
        const period = (endTime - startTime) / 1000.0;
        console.log("p" + ('000' + problem.problemNumber).slice(-3) + ': ' + result + ' -> ' + period + ' s');
        expect(result).toBe(25164150);
        expect(period).toBeLessThan(60);
    });

    it('should solve p007', () => {
        const problem: Solution = new P007();
        const startTime = +new Date();

        const result = problem.solve();

        const endTime = +new Date();
        const period = (endTime - startTime) / 1000.0;
        console.log("p" + ('000' + problem.problemNumber).slice(-3) + ': ' + result + ' -> ' + period + ' s');
        expect(result).toBe(104743);
        expect(period).toBeLessThan(60);
    });

    it('should solve p008', () => {
        const problem: Solution = new P008();
        const startTime = +new Date();

        const result = problem.solve();

        const endTime = +new Date();
        const period = (endTime - startTime) / 1000.0;
        console.log("p" + ('000' + problem.problemNumber).slice(-3) + ': ' + result + ' -> ' + period + ' s');
        expect(result).toBe(23514624000);
        expect(period).toBeLessThan(60);
    });

    it('should solve p009', () => {
        const problem: Solution = new P009();
        const startTime = +new Date();

        const result = problem.solve();

        const endTime = +new Date();
        const period = (endTime - startTime) / 1000.0;
        console.log("p" + ('000' + problem.problemNumber).slice(-3) + ': ' + result + ' -> ' + period + ' s');
        expect(result).toBe(31875000);
        expect(period).toBeLessThan(60);
    });

    it('should solve p010', () => {
        const problem: Solution = new P010();
        const startTime = +new Date();

        const result = problem.solve();

        const endTime = +new Date();
        const period = (endTime - startTime) / 1000.0;
        console.log("p" + ('000' + problem.problemNumber).slice(-3) + ': ' + result + ' -> ' + period + ' s');
        expect(result).toBe(142913828922);
        expect(period).toBeLessThan(60);
    });

    it('should solve p011', () => {
        const problem: Solution = new P011();
        const startTime = +new Date();

        const result = problem.solve();

        const endTime = +new Date();
        const period = (endTime - startTime) / 1000.0;
        console.log("p" + ('000' + problem.problemNumber).slice(-3) + ': ' + result + ' -> ' + period + ' s');
        expect(result).toBe(70600674);
        expect(period).toBeLessThan(60);
    });

    it('should solve p012', () => {
        const problem: Solution = new P012();
        const startTime = +new Date();

        const result = problem.solve();

        const endTime = +new Date();
        const period = (endTime - startTime) / 1000.0;
        console.log("p" + ('000' + problem.problemNumber).slice(-3) + ': ' + result + ' -> ' + period + ' s');
        expect(result).toBe(76576500);
        expect(period).toBeLessThan(60);
    });

    it('should solve p013', () => {
        const problem: Solution = new P013();
        const startTime = +new Date();

        const result = problem.solve();

        const endTime = +new Date();
        const period = (endTime - startTime) / 1000.0;
        console.log("p" + ('000' + problem.problemNumber).slice(-3) + ': ' + result + ' -> ' + period + ' s');
        expect(result).toBe(5537376230);
        expect(period).toBeLessThan(60);
    });

    it('should solve p014', () => {
        const problem: Solution = new P014();
        const startTime = +new Date();

        const result = problem.solve();

        const endTime = +new Date();
        const period = (endTime - startTime) / 1000.0;
        console.log("p" + ('000' + problem.problemNumber).slice(-3) + ': ' + result + ' -> ' + period + ' s');
        expect(result).toBe(837799);
        expect(period).toBeLessThan(60);
    });

    it('should solve p015', () => {
        const problem: Solution = new P015();
        const startTime = +new Date();

        const result = problem.solve();

        const endTime = +new Date();
        const period = (endTime - startTime) / 1000.0;
        console.log("p" + ('000' + problem.problemNumber).slice(-3) + ': ' + result + ' -> ' + period + ' s');
        expect(result).toBe(137846528820);
        expect(period).toBeLessThan(60);
    });
    
});
