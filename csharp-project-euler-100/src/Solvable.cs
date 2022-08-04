
namespace net.talaatharb.projecteuler100
{

    /**
     * Interface for all the problem solutions
     * 
     * @author mharb
     *
     */
    public interface Solvable
    {

        /**
         * Return the problem number
         * 
         * @return The problem number
         */
        public abstract int getProblemNumber();

        /**
         * Solve a problem and provide the solution
         * 
         * @return The solution to the problem
         */
        public abstract long solve();

        /**
        * Run the solution and the timing code
		*/
        public abstract void run();
    }
}


