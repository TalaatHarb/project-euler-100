using net.talaatharb.projecteuler100.Core;

namespace net.talaatharb.projecteuler100.Tests;

public class UnitTestP002
{
    /**
    * Testing P002
    */
    [Fact]
    public void TestP002()
    {
        const long expectedResult = 4613732;
        Tester.SolveAndTest(expectedResult, new P002());
    }
}
