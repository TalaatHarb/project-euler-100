using net.talaatharb.projecteuler100.Core;

namespace net.talaatharb.projecteuler100.Tests;

public class UnitTestP001
{
    [Fact]
    public void TestP001()
    {
        const long expectedResult = 233168;
        Tester.SolveAndTest(expectedResult, new Core.P001());
    }
}
