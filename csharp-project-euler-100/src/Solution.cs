using System.Diagnostics;

namespace net.talaatharb.projecteuler100
{

    /**
     * Base class for all the solutions
     * 
     * @author mharb
     *
     */
    public abstract class Solution : Solvable
    {

        protected int problemNumber = 0;

        public int GetProblemNumber()
        {
            return problemNumber;
        }

        public abstract long Solve();

        public void Run()
        {
            Stopwatch stopwatch = new Stopwatch();
            stopwatch.Start();
            long result = Solve();
            stopwatch.Stop();
            double period = stopwatch.Elapsed.TotalSeconds;

            Console.WriteLine("p" + ("000" + problemNumber).Substring((problemNumber + "").Length) + ": " + result
                + " -> " + period + " s");
        }
    }
}
