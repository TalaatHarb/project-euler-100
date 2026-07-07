using net.talaatharb.projecteuler100.Core;

namespace net.talaatharb.projecteuler100.Tests;

public class UnitTestP021
{
    /**
     * Testing P021
     */
    [Fact]
    public void TestP021()
    {
        const long expectedResult = 31626;
        Tester.SolveAndTest(expectedResult, new P021());
    }
}
