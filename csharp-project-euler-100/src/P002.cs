

namespace net.talaatharb.projecteuler100
{

    /**
    * @author mharb
    *
    */
    public class P002 : Solution
    {

        /**
         * Problem solution entry point
         * 
         * @param args
         */
        public static void main(String[] args)
        {
            new P002().run();
        }

        public override int solve()
        {
            problemNumber = 2;
            long max = 4000000;
            int previous = 1;
            int current = 2;
            int sum = current;
            while (current < max)
            {
                int next = previous + current;
                if ((next < max) && (next % 2 == 0))
                {
                    sum += next;
                }
                previous = current;
                current = next;
            }

            return sum;
        }
    }
}

