using net.talaatharb.projecteuler100.Core;

namespace net.talaatharb.projecteuler100.Tests;

public class UnitTestP025
{
    /**
     * Testing P025
     */
    [Fact]
    public void TestP025()
    {
        const long expectedResult = 4782;
        Tester.SolveAndTest(expectedResult, new P025());
    }

}
