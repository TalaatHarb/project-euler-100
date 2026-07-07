using net.talaatharb.projecteuler100.Core;

namespace net.talaatharb.projecteuler100.Tests;

public class UnitTestP007
{
    /**
     * Testing P007
     */
    [Fact]
    public void TestP007()
    {
        const long expectedResult = 104743;
        Tester.SolveAndTest(expectedResult, new P007());
    }
}
