using net.talaatharb.projecteuler100.Core;

namespace net.talaatharb.projecteuler100.Tests;

public class UnitTestP016
{
    /**
     * Testing P016
     */
    [Fact]
    public void TestP016()
    {
        const long expectedResult = 1366;
        Tester.SolveAndTest(expectedResult, new P016());
    }
}
