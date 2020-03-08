export abstract class Solution{

    protected problemNumber = 0;

    run() {
        const startTime = +new Date();

        const result = this.solve();

        const endTime = +new Date();
        const period = (endTime - startTime) / 1000.0;
        console.log("p" + ('000' + this.problemNumber).slice(-3) + ': ' + result + ' -> ' + period + ' s');
    }
    
    abstract solve(): number;
}
