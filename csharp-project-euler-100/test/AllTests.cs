using Xunit;

namespace net.talaatharb.projecteuler100
{
    public class AllTests
    {
        private void solveAndTest(int expectedResult, Solvable problem)
        {
            int result = problem.solve();
            Assert.Equal(expectedResult, result);
        }

        [Fact]
        public void testP001()
        {
            const int expectedResult = 233168;
            solveAndTest(expectedResult, new P001());
        }

        [Fact]
        public void testP002() {
		int expectedResult = 4613732;
		solveAndTest(expectedResult, new P002());
	}

    }
}