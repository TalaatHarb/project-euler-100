

namespace net.talaatharb.projecteuler100
{

    /**
    * @author mharb
    *
    */
    public class P009 : Solution
    {

        /**
         * Problem solution entry point
         * 
         * @param args
         */
        public static void Main(string[] args)
        {
            new P009().run();
        }

        public override long solve()
        {
            problemNumber = 9;
            const int targetSum = 1000;
            int product = 0;
            for (int a = 1; a < (targetSum - 2); a++)
            {
                for (int b = a + 1; b < (targetSum - 1); b++)
                {
                    int sumOfSquares = a * a + b * b;
                    double c = (Math.Sqrt(sumOfSquares));
                    double sum = a + b + c;
                    if (sum == targetSum)
                    {
                        c = Math.Floor(c);
                        product = (int)(a * b * c);
                    }
                }
            }

            return product;
        }
    }
}

