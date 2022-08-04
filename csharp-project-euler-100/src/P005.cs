

namespace net.talaatharb.projecteuler100
{

    /**
    * @author mharb
    *
    */
    public class P005 : Solution
    {

        /**
         * Problem solution entry point
         * 
         * @param args
         */
        public static void Main(string[] args)
        {
            new P005().run();
        }

        public override long solve()
        {
            problemNumber = 5;
            const int last = 20;
            List<int> sequence = new List<int>();
            int result = 1;
            int number = 2;
            int counter = number;
            while (counter <= last)
            {
                foreach (int i in sequence)
                {
                    if (number % i == 0)
                    {
                        number /= i;
                    }
                }

                result *= number;
                sequence.Add(number);
                counter += 1;
                number = counter;
            }

            return result;
        }
    }
}

