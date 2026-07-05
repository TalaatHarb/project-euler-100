using net.talaatharb.projecteuler100.Core;

namespace net.talaatharb.projecteuler100.Tests;

public class UnitTestP009
{
    /**
     * Testing P009
     */
    [Fact]
    public void TestP009()
    {
        const long expectedResult = 31875000;
        Tester.SolveAndTest(expectedResult, new P009());
    }
}
