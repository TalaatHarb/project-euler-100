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
            problems.Add(new P004());
            problems.Add(new P005());
            problems.Add(new P006());
            problems.Add(new P007());
            problems.Add(new P008());
            problems.Add(new P009());
            problems.Add(new P010());
            problems.Add(new P011());
            problems.Add(new P012());
            problems.Add(new P013());
            problems.Add(new P014());
            problems.Add(new P015());
            problems.Add(new P016());
            problems.Add(new P017());
            problems.Add(new P018());
            problems.Add(new P019());
            problems.Add(new P020());
            problems.Add(new P021());
            problems.Add(new P022());
            problems.Add(new P023());
            problems.Add(new P024());
            problems.Add(new P025());
            
            
            solveSequential(problems);
        }
    }
}