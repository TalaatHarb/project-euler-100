using Xunit;

namespace net.talaatharb.projecteuler100
{
    public class AllTests
    {
        private void solveAndTest(long expectedResult, Solvable problem)
        {
            long result = problem.solve();
            Assert.Equal(expectedResult, result);
        }

        [Fact]
        public void testP001()
        {
            const long expectedResult = 233168;
            solveAndTest(expectedResult, new P001());
        }

        [Fact]
        public void testP002()
        {
            const long expectedResult = 4613732;
            solveAndTest(expectedResult, new P002());
        }

        [Fact]
        public void testP003() {
		const long expectedResult = 6857;
		solveAndTest(expectedResult, new P003());
	}

    }
}