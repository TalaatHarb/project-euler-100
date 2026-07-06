

namespace net.talaatharb.projecteuler100.Core
{

    /**
    * @author mharb
    *
    */
    public class P000 : Solution
    {

        /**
         * Problem solution entry point
         * 
         * @param args
         */
        public static void Main(string[] args)
        {
            new P000().Run();
        }

        public override long Solve()
        {
            problemNumber = 0;
            long sum = 0;
            int count = 702000;
            for (long i = 1; i <= count; i += 2)
            {
                sum += i * i;
            }
            return (long)sum;
        }
    }
}

