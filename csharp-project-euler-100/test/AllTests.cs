using Xunit;
using System.Diagnostics;

namespace net.talaatharb.projecteuler100
{
    public class AllTests
    {
        private static void SolveAndTest(long expectedResult, ISolvable problem)
        {
            Stopwatch stopwatch = new();
            stopwatch.Start();
            long result = problem.Solve();
            stopwatch.Stop();
            double period = stopwatch.Elapsed.TotalSeconds;

            Console.WriteLine("p" + ("000" + problem.GetProblemNumber())[(problem.GetProblemNumber() + "").Length..] + ": " + result
                + " -> " + period + " s");
            Assert.Equal(expectedResult, result);
        }

        /**
        * Testing P001
        */
        [Fact]
        public void TestP001()
        {
            const long expectedResult = 233168;
            SolveAndTest(expectedResult, new P001());
        }

        /**
        * Testing P002
        */
        [Fact]
        public void TestP002()
        {
            const long expectedResult = 4613732;
            SolveAndTest(expectedResult, new P002());
        }

        /**
        * Testing P003
        */
        [Fact]
        public void TestP003()
        {
            const long expectedResult = 6857;
            SolveAndTest(expectedResult, new P003());
        }

        /**
	    * Testing P004
	    */
        [Fact]
        public void TestP004()
        {
            const long expectedResult = 906609;
            SolveAndTest(expectedResult, new P004());
        }

        /**
         * Testing P005
         */
        [Fact]
        public void TestP005()
        {
            const long expectedResult = 232792560;
            SolveAndTest(expectedResult, new P005());
        }

        /**
         * Testing P006
         */
        [Fact]
        public void TestP006()
        {
            const long expectedResult = 25164150;
            SolveAndTest(expectedResult, new P006());
        }

        /**
         * Testing P007
         */
        [Fact]
        public void TestP007()
        {
            const long expectedResult = 104743;
            SolveAndTest(expectedResult, new P007());
        }

        /**
         * Testing P008
         */
        [Fact]
        public void TestP008()
        {
            const long expectedResult = 23514624000L;
            SolveAndTest(expectedResult, new P008());
        }

        /**
         * Testing P009
         */
        [Fact]
        public void TestP009()
        {
            const long expectedResult = 31875000;
            SolveAndTest(expectedResult, new P009());
        }

        /**
         * Testing P010
         */
        [Fact]
        public void TestP010()
        {
            const long expectedResult = 142913828922L;
            SolveAndTest(expectedResult, new P010());
        }

        /**
         * Testing P011
         */
        [Fact]
        public void TestP011()
        {
            const long expectedResult = 70600674;
            SolveAndTest(expectedResult, new P011());
        }

        /**
         * Testing P012
         */
        [Fact]
        public void TestP012()
        {
            const long expectedResult = 76576500;
            SolveAndTest(expectedResult, new P012());
        }

        /**
         * Testing P013
         */
        [Fact]
        public void TestP013()
        {
            const long expectedResult = 5537376230L;
            SolveAndTest(expectedResult, new P013());
        }

        /**
         * Testing P014
         */
        [Fact]
        public void TestP014()
        {
            const long expectedResult = 837799;
            SolveAndTest(expectedResult, new P014());
        }

        /**
         * Testing P015
         */
        [Fact]
        public void TestP015()
        {
            const long expectedResult = 137846528820L;
            SolveAndTest(expectedResult, new P015());
        }

        /**
         * Testing P016
         */
        [Fact]
        public void TestP016()
        {
            const long expectedResult = 1366;
            SolveAndTest(expectedResult, new P016());
        }

        /**
         * Testing P017
         */
        [Fact]
        public void TestP017()
        {
            const long expectedResult = 21124;
            SolveAndTest(expectedResult, new P017());
        }

        /**
         * Testing P018
         */
        [Fact]
        public void TestP018()
        {
            const long expectedResult = 1074;
            SolveAndTest(expectedResult, new P018());
        }

        /**
         * Testing P019
         */
        [Fact]
        public void TestP019()
        {
            const long expectedResult = 171;
            SolveAndTest(expectedResult, new P019());
        }

        /**
         * Testing P020
         */
        [Fact]
        public void TestP020()
        {
            const long expectedResult = 648;
            SolveAndTest(expectedResult, new P020());
        }

        /**
         * Testing P021
         */
        [Fact]
        public void TestP021()
        {
            const long expectedResult = 31626;
            SolveAndTest(expectedResult, new P021());
        }

        /**
         * Testing P022
         */
        [Fact]
        public void TestP022()
        {
            const long expectedResult = 871198282;
            SolveAndTest(expectedResult, new P022());
        }

        /**
         * Testing P023
         */
        [Fact]
        public void TestP023()
        {
            const long expectedResult = 4179871;
            SolveAndTest(expectedResult, new P023());
        }

        /**
         * Testing P024
         */
        [Fact]
        public void TestP024()
        {
            const long expectedResult = 2783915460L;
            SolveAndTest(expectedResult, new P024());
        }

        /**
         * Testing P025
         */
        [Fact]
        public void TestP025()
        {
            const long expectedResult = 4782;
            SolveAndTest(expectedResult, new P025());
        }

    }
}