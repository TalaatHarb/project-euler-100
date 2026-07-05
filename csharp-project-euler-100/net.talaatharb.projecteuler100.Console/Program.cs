using net.talaatharb.projecteuler100.Core;

internal class Program
{
    private static void SolveParallel(List<Solution> problems)
    {
        Console.WriteLine("Running in parallel");
    }

    private static void SolveSequential(List<Solution> problems)
    {
        foreach (Solution problem in problems)
        {
            problem.Run();
        }
    }

    public static void Main(string[] args)
    {
        // Create list of solutions
        List<Solution> problems =
        [
            // Add solutions to list
            new P001(),
                new P002(),
                new P003(),
                new P004(),
                new P005(),
                new P006(),
                new P007(),
                new P008(),
                new P009(),
                new P010(),
                new P011(),
                new P012(),
                new P013(),
                new P014(),
                new P015(),
                new P016(),
                new P017(),
                new P018(),
                new P019(),
                new P020(),
                new P021(),
                new P022(),
                new P023(),
                new P024(),
                new P025(),
            ];


        SolveSequential(problems);
    }
}