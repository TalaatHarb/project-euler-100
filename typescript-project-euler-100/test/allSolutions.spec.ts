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

describe('All solutions', () => {
    it('should solve p001', () => {
        expect(new P001().solve()).toBe(233168);
    });

    it('should solve p002', () => {
        expect(new P002().solve()).toBe(4613732);
    });

    it('should solve p003', () => {
        expect(new P003().solve()).toBe(6857);
    });

    it('should solve p004', () => {
        expect(new P004().solve()).toBe(906609);
    });

    it('should solve p005', () => {
        expect(new P005().solve()).toBe(232792560);
    });

    it('should solve p006', () => {
        expect(new P006().solve()).toBe(25164150);
    });

    it('should solve p007', () => {
        expect(new P007().solve()).toBe(104743);
    });

    it('should solve p008', () => {
        expect(new P008().solve()).toBe(23514624000);
    });

    it('should solve p009', () => {
        expect(new P009().solve()).toBe(31875000);
    });

    it('should solve p010', () => {
        expect(new P010().solve()).toBe(142913828922);
    });

});
