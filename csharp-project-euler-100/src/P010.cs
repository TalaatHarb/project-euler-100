

namespace net.talaatharb.projecteuler100
{


    /**
    * @author mharb
    *
    */
    public class P010 : Solution
    {

        private static List<int> sieveOfEratosthenes(int n)
        {
            /**
             * Create a boolean array "notPrime[0..n]" and initialize all entries in it as
             * false. A value in notPrime[i] will finally be true if i is not a prime, else
             * false.
             */
            bool[] notPrime = new bool[n];

            int p = 2;
            while (p * p <= n)
            {

                // If notPrime[p] is not changed, then it is a notPrime
                if (!notPrime[p])
                {
                    // Update all multiples of p
                    for (int i = (p * 2); i < n; i += p)
                    {
                        notPrime[i] = true;
                    }
                }
                p += 1;
            }
            notPrime[0] = true;
            notPrime[1] = true;

            List<int> listOfPrimes = new List<int>();
            for (int i = 0; i < n; i++)
            {
                if (!notPrime[i])
                {
                    listOfPrimes.Add(i);
                }
            }

            return listOfPrimes;
        }

        /**
         * Problem solution entry point
         * 
         * @param args
         */
        public static void Main(string[] args)
        {
            new P010().run();
        }

        public override long solve()
        {
            problemNumber = 10;
            const int last = 2000000;
            long sum = 0;
            List<int> listOfPrimes = sieveOfEratosthenes(last);
            foreach (int i in listOfPrimes)
            {
                sum += i;
            }

            return sum;
        }
    }
}

