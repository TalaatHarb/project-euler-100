using net.talaatharb.projecteuler100.Core;

namespace net.talaatharb.projecteuler100.Tests;

public class UnitTestP014
{
    /**
     * Testing P014
     */
    [Fact]
    public void TestP014()
    {
        const long expectedResult = 837799;
        Tester.SolveAndTest(expectedResult, new P014());
    }
}
