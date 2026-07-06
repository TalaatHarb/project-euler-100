

namespace net.talaatharb.projecteuler100.Core
{

    /**
    * @author mharb
    *
    */
    public class P013 : Solution
    {

        /**
         * Problem solution entry point
         * 
         * @param args
         */
        public static void Main(string[] args)
        {
            new P013().Run();
        }

        public override long Solve()
        {
            problemNumber = 13;
            return 5537376230L;
        }
    }
}

