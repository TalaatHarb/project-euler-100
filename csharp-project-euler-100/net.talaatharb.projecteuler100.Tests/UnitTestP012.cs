using net.talaatharb.projecteuler100.Core;

namespace net.talaatharb.projecteuler100.Tests;

public class UnitTestP012
{
    /**
     * Testing P012
     */
    [Fact]
    public void TestP012()
    {
        const long expectedResult = 76576500;
        Tester.SolveAndTest(expectedResult, new P012());
    }
}
