using net.talaatharb.projecteuler100.Core;

namespace net.talaatharb.projecteuler100.Tests;

public class UnitTestP023
{
    /**
     * Testing P023
     */
    [Fact]
    public void TestP023()
    {
        const long expectedResult = 4179871;
        Tester.SolveAndTest(expectedResult, new P023());
    }
}
