using net.talaatharb.projecteuler100.Core;

namespace net.talaatharb.projecteuler100.Tests;

public class UnitTestP020
{
    /**
     * Testing P020
     */
    [Fact]
    public void TestP020()
    {
        const long expectedResult = 648;
        Tester.SolveAndTest(expectedResult, new P020());
    }
}
