using System.Diagnostics;

namespace net.talaatharb.projecteuler100
{

    /**
     * Base class for all the solutions
     * 
     * @author mharb
     *
     */
    public abstract class Solution : ISolvable
    {

        protected int problemNumber = 0;

        public int GetProblemNumber()
        {
            return problemNumber;
        }

        public abstract long Solve();

        public void Run()
        {
            Stopwatch stopwatch = new();
            stopwatch.Start();
            long result = Solve();
            stopwatch.Stop();
            double period = stopwatch.Elapsed.TotalSeconds;

            Console.WriteLine("p" + ("000" + problemNumber)[(problemNumber + "").Length..] + ": " + result
                + " -> " + period + " s");
        }
    }
}
