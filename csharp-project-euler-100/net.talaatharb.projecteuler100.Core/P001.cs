

namespace net.talaatharb.projecteuler100.Core
{

    /**
    * @author mharb
    *
    */
    public class P001 : Solution
    {

        /**
         * Problem solution entry point
         * 
         * @param args
         */
        public static void Main(string[] args)
        {
            new P001().Run();
        }

        public override long Solve()
        {
            problemNumber = 1;
            const int last = 1000;
            int sum = 0;

            for (int i = 1; i < last; i++)
            {
                if ((i % 3 == 0) || (i % 5 == 0))
                {
                    sum = sum + i;
                }
            }

            return sum;
        }
    }
}

