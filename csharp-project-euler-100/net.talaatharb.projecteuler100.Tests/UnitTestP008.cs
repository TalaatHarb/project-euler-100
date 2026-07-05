using net.talaatharb.projecteuler100.Core;

namespace net.talaatharb.projecteuler100.Tests;

public class UnitTestP008
{
    /**
     * Testing P008
     */
    [Fact]
    public void TestP008()
    {
        const long expectedResult = 23514624000L;
        Tester.SolveAndTest(expectedResult, new P008());
    }
}
