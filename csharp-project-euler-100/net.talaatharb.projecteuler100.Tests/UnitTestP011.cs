using net.talaatharb.projecteuler100.Core;

namespace net.talaatharb.projecteuler100.Tests;

public class UnitTestP011
{
    /**
     * Testing P011
     */
    [Fact]
    public void TestP011()
    {
        const long expectedResult = 70600674;
        Tester.SolveAndTest(expectedResult, new P011());
    }
}
