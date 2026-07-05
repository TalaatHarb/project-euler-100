using net.talaatharb.projecteuler100.Core;

namespace net.talaatharb.projecteuler100.Tests;

public class UnitTestP006
{
    /**
     * Testing P006
     */
    [Fact]
    public void TestP006()
    {
        const long expectedResult = 25164150;
        Tester.SolveAndTest(expectedResult, new P006());
    }
}
