using net.talaatharb.projecteuler100.Core;

namespace net.talaatharb.projecteuler100.Tests;

public class UnitTestP019
{
    /**
     * Testing P019
     */
    [Fact]
    public void TestP019()
    {
        const long expectedResult = 171;
        Tester.SolveAndTest(expectedResult, new P019());
    }
}
