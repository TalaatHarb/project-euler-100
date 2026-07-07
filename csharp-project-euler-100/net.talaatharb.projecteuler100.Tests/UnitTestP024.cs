using net.talaatharb.projecteuler100.Core;

namespace net.talaatharb.projecteuler100.Tests;

public class UnitTestP024
{
    /**
     * Testing P024
     */
    [Fact]
    public void TestP024()
    {
        const long expectedResult = 2783915460L;
        Tester.SolveAndTest(expectedResult, new P024());
    }
}
