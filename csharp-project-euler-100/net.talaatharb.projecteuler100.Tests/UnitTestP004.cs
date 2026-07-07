using net.talaatharb.projecteuler100.Core;

namespace net.talaatharb.projecteuler100.Tests;

public class UnitTestP004
{
    /**
	    * Testing P004
	    */
    [Fact]
    public void TestP004()
    {
        const long expectedResult = 906609;
        Tester.SolveAndTest(expectedResult, new P004());
    }
}
