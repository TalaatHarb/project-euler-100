using net.talaatharb.projecteuler100.Core;
using System.Diagnostics;

namespace net.talaatharb.projecteuler100.Tests;

public class Tester
{
    public static void SolveAndTest(long expectedResult, ISolvable problem)
    {
        Stopwatch stopwatch = new();
        stopwatch.Start();
        long result = problem.Solve();
        stopwatch.Stop();
        double period = stopwatch.Elapsed.TotalSeconds;

        Console.WriteLine("p" + ("000" + problem.GetProblemNumber())[(problem.GetProblemNumber() + "").Length..] + ": " + result
            + " -> " + period + " s");
        Assert.Equal(expectedResult, result);
    }
}
