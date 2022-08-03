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

        public abstract int solve();

        public void run()
        {
            // code to caclulate the time of the solution
            Stopwatch stopwatch = new Stopwatch();
            stopwatch.Start();
            int result = solve();
            stopwatch.Stop();
            // code to print the result
            Console.WriteLine("Problem #{0}", problemNumber);

            Console.WriteLine("Result: {0}", result);

            Console.WriteLine("Time: {0}", stopwatch.Elapsed);
        }
    }
}
