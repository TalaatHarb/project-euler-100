using net.talaatharb.projecteuler100.Core;

namespace net.talaatharb.projecteuler100.Tests;

public class UnitTestP010
{
    /**
     * Testing P010
     */
    [Fact]
    public void TestP010()
    {
        const long expectedResult = 142913828922L;
        Tester.SolveAndTest(expectedResult, new P010());
    }
}
