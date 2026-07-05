using net.talaatharb.projecteuler100.Core;

namespace net.talaatharb.projecteuler100.Tests;

public class UnitTestP005
{
    /**
     * Testing P005
     */
    [Fact]
    public void TestP005()
    {
        const long expectedResult = 232792560;
        Tester.SolveAndTest(expectedResult, new P005());
    }
}
