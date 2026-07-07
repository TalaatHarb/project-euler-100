using net.talaatharb.projecteuler100.Core;

namespace net.talaatharb.projecteuler100.Tests;

public class UnitTestP000
{
    [Fact]
    public void TestP000()
    {
        const long expectedResult = 57658067999883000;
        Tester.SolveAndTest(expectedResult, new P000());
    }
}
