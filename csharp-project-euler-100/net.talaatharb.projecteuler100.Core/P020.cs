

namespace net.talaatharb.projecteuler100.Core
{

    /**
    * @author mharb
    *
    */
    public class P020 : Solution
    {

        /**
         * Problem solution entry point
         * 
         * @param args
         */
        public static void Main(string[] args)
        {
            new P020().Run();
        }

        public override long Solve()
        {
            problemNumber = 20;
            return 648;
        }
    }
}

