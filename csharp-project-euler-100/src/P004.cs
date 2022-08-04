

namespace net.talaatharb.projecteuler100
{

    /**
    * @author mharb
    *
    */
    public class P004 : Solution
    {

        private bool isPalindromic(int number)
        {
            string numberAsString = number + "";
            int length = numberAsString.Length;
            bool result = true;
            int j = 0;

            for (int i = 0; i < length / 2; i++)
            {
                j = length - i - 1;
                if (numberAsString[i] != numberAsString[j])
                {
                    result = false;
                    break;
                }
            }
            return result;
        }

        /**
         * Problem solution entry point
         * 
         * @param args
         */
        public static void Main(string[] args)
        {
            new P004().run();
        }

        public override long solve()
        {
            problemNumber = 4;
            int start = 99;
            int finish = 999;
            int result = 0;
            int i = finish;

            while (i > start)
            {

                for (int j = finish; j > start; j--)
                {

                    int number = i * j;
                    if (number > result && isPalindromic(number))
                    {
                        result = number;
                        break;
                    }
                }
                i--;
            }

            return result;
        }
    }
}

