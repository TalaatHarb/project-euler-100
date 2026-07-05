using net.talaatharb.projecteuler100.Core;

namespace net.talaatharb.projecteuler100.Tests;

public class UnitTestP022
{
    /**
     * Testing P022
     */
    [Fact]
    public void TestP022()
    {
        const long expectedResult = 871198282;
        Tester.SolveAndTest(expectedResult, new P022());
    }
}
