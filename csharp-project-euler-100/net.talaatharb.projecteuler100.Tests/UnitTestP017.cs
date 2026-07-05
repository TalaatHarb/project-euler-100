using net.talaatharb.projecteuler100.Core;

namespace net.talaatharb.projecteuler100.Tests;

public class UnitTestP017
{
    /**
     * Testing P017
     */
    [Fact]
    public void TestP017()
    {
        const long expectedResult = 21124;
        Tester.SolveAndTest(expectedResult, new P017());
    }
}
