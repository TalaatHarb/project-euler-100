using net.talaatharb.projecteuler100.Core;

namespace net.talaatharb.projecteuler100.Tests;

public class UnitTestP015
{
    /**
     * Testing P015
     */
    [Fact]
    public void TestP015()
    {
        const long expectedResult = 137846528820L;
        Tester.SolveAndTest(expectedResult, new P015());
    }
}
