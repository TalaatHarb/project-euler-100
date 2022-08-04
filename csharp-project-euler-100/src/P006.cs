

namespace net.talaatharb.projecteuler100
{

    /**
    * @author mharb
    *
    */
    public class P006 : Solution
    {

        /**
         * Problem solution entry point
         * 
         * @param args
         */
        public static void Main(string[] args)
        {
            new P006().run();
        }

        public override long solve()
        {
            problemNumber = 6;
            int result = 0;
            int last = 100;
            int sum = 0;
            int sumOfSquares = 0;

            for (int i = 1; i < last + 1; i++)
            {
                sum += i;
                sumOfSquares += (i * i);
            }
            result = (sum * sum) - sumOfSquares;

            return result;
        }
    }
}

