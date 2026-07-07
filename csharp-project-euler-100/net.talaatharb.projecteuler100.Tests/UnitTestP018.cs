using net.talaatharb.projecteuler100.Core;

namespace net.talaatharb.projecteuler100.Tests;

public class UnitTestP018
{
    /**
     * Testing P018
     */
    [Fact]
    public void TestP018()
    {
        const long expectedResult = 1074;
        Tester.SolveAndTest(expectedResult, new P018());
    }
}
