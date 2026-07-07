using net.talaatharb.projecteuler100.Core;

namespace net.talaatharb.projecteuler100.Tests;

public class UnitTestP003
{
    /**
    * Testing P003
    */
    [Fact]
    public void TestP003()
    {
        const long expectedResult = 6857;
        Tester.SolveAndTest(expectedResult, new P003());
    }
}
