

namespace net.talaatharb.projecteuler100
{

    /**
    * @author mharb
    *
    */
    public class P007 : Solution
    {
        private static bool isPrime(long number)
        {
            if (number % 2 == 0)
            {
                return false;
            }
            double upperLimit = Math.Floor(Math.Sqrt(number));
            if (upperLimit % 2 == 0)
            {
                upperLimit--;
            }
            for (int i = (int)upperLimit; i > 1; i -= 2)
            {
                if (number % i == 0)
                {
                    return false;
                }
            }
            return true;
        }

        /**
         * Problem solution entry point
         * 
         * @param args
         */
        public static void Main(string[] args)
        {
            new P007().run();
        }

        public override long solve()
        {
            problemNumber = 7;
            const int target = 10001;
            int counter = 1;
            int current = 0;

            int i = 1;
            while (counter <= target)
            {
                if (isPrime(i))
                {
                    current = i;
                    counter += 1;
                }
                i += 2;
            }

            return current;
        }
    }
}

