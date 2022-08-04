

namespace net.talaatharb.projecteuler100
{

    /**
    * @author mharb
    *
    */
    public class P003 : Solution
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
            new P003().run();
        }

        public override long solve()
        {
            problemNumber = 3;
            const long number = 600851475143L;

            double upperLimit = Math.Floor(Math.Sqrt(number));
            if (upperLimit % 2 == 0)
            {
                upperLimit--;
            }
            long possibleFactor = (long)upperLimit;
            long result = number;
            while (possibleFactor > 1)
            {
                if ((number % possibleFactor == 0) && isPrime(possibleFactor))
                {
                    result = possibleFactor;
                    break;
                }
                possibleFactor -= 2;
            }
            return result;
        }
    }
}

