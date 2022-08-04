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

        public int getProblemNumber()
        {
            return problemNumber;
        }

        public abstract long solve();

        public void run()
        {
            Stopwatch stopwatch = new Stopwatch();
            stopwatch.Start();
            long result = solve();
            stopwatch.Stop();
            double period = stopwatch.Elapsed.TotalSeconds;

            Console.WriteLine("p" + ("000" + problemNumber).Substring((problemNumber + "").Length) + ": " + result
                + " -> " + period + " s");
        }
    }
}
