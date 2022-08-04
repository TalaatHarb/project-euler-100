namespace net.talaatharb.projecteuler100
{
    public class AllSolutions
    {

        private static void solveParallel(List<Solution> problems)
        {
            Console.WriteLine("Running in parallel");
        }

        private static void solveSequential(List<Solution> problems)
        {
            foreach (Solution problem in problems)
            {
                problem.run();
            }
        }

        public static void Main(string[] args)
        {
            // Create list of solutions
            List<Solution> problems = new List<Solution>();

            // Add solutions to list
            problems.Add(new P001());
            problems.Add(new P002());
            problems.Add(new P003());

            solveSequential(problems);
        }
    }
}