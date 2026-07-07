using net.talaatharb.projecteuler100.Core;

namespace net.talaatharb.projecteuler100.Tests;

public class UnitTestP013
{
    /**
     * Testing P013
     */
    [Fact]
    public void TestP013()
    {
        const long expectedResult = 5537376230L;
        Tester.SolveAndTest(expectedResult, new P013());
    }
}
