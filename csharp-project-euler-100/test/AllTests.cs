using Xunit;
using System.Diagnostics;

namespace net.talaatharb.projecteuler100
{
    public class AllTests
    {
        private void solveAndTest(long expectedResult, Solvable problem)
        {
            Stopwatch stopwatch = new Stopwatch();
            stopwatch.Start();
            long result = problem.solve();
            stopwatch.Stop();
            double period = stopwatch.Elapsed.TotalSeconds;

            Console.WriteLine("p" + ("000" + problem.getProblemNumber()).Substring((problem.getProblemNumber() + "").Length) + ": " + result
                + " -> " + period + " s");
            Assert.Equal(expectedResult, result);
        }

        /**
        * Testing P001
        */
        [Fact]
        public void testP001()
        {
            const long expectedResult = 233168;
            solveAndTest(expectedResult, new P001());
        }

        /**
        * Testing P002
        */
        [Fact]
        public void testP002()
        {
            const long expectedResult = 4613732;
            solveAndTest(expectedResult, new P002());
        }

        /**
        * Testing P003
        */
        [Fact]
        public void testP003()
        {
            const long expectedResult = 6857;
            solveAndTest(expectedResult, new P003());
        }

        /**
	    * Testing P004
	    */
        [Fact]
        void testP004()
        {
            const long expectedResult = 906609;
            solveAndTest(expectedResult, new P004());
        }

        /**
         * Testing P005
         */
        [Fact]
        void testP005()
        {
            const long expectedResult = 232792560;
            solveAndTest(expectedResult, new P005());
        }

        /**
         * Testing P006
         */
        [Fact]
        void testP006()
        {
            const long expectedResult = 25164150;
            solveAndTest(expectedResult, new P006());
        }

        /**
         * Testing P007
         */
        [Fact]
        void testP007()
        {
            const long expectedResult = 104743;
            solveAndTest(expectedResult, new P007());
        }

        /**
         * Testing P008
         */
        [Fact]
        void testP008()
        {
            const long expectedResult = 23514624000L;
            solveAndTest(expectedResult, new P008());
        }

        /**
         * Testing P009
         */
        [Fact]
        void testP009()
        {
            const long expectedResult = 31875000;
            solveAndTest(expectedResult, new P009());
        }

        /**
         * Testing P010
         */
        [Fact]
        void testP010()
        {
            const long expectedResult = 142913828922L;
            solveAndTest(expectedResult, new P010());
        }

        /**
         * Testing P011
         */
        [Fact]
        void testP011()
        {
            const long expectedResult = 70600674;
            solveAndTest(expectedResult, new P011());
        }

        /**
         * Testing P012
         */
        [Fact]
        void testP012()
        {
            const long expectedResult = 76576500;
            solveAndTest(expectedResult, new P012());
        }

        /**
         * Testing P013
         */
        [Fact]
        void testP013()
        {
            const long expectedResult = 5537376230L;
            solveAndTest(expectedResult, new P013());
        }

        /**
         * Testing P014
         */
        [Fact]
        void testP014()
        {
            const long expectedResult = 837799;
            solveAndTest(expectedResult, new P014());
        }

        /**
         * Testing P015
         */
        [Fact]
        void testP015()
        {
            const long expectedResult = 137846528820L;
            solveAndTest(expectedResult, new P015());
        }

        /**
         * Testing P016
         */
        [Fact]
        void testP016()
        {
            const long expectedResult = 1366;
            solveAndTest(expectedResult, new P016());
        }

        /**
         * Testing P017
         */
        [Fact]
        void testP017()
        {
            const long expectedResult = 21124;
            solveAndTest(expectedResult, new P017());
        }

        /**
         * Testing P018
         */
        [Fact]
        void testP018()
        {
            const long expectedResult = 1074;
            solveAndTest(expectedResult, new P018());
        }

        /**
         * Testing P019
         */
        [Fact]
        void testP019()
        {
            const long expectedResult = 171;
            solveAndTest(expectedResult, new P019());
        }

        /**
         * Testing P020
         */
        [Fact]
        void testP020()
        {
            const long expectedResult = 648;
            solveAndTest(expectedResult, new P020());
        }

        /**
         * Testing P021
         */
        [Fact]
        void testP021()
        {
            const long expectedResult = 31626;
            solveAndTest(expectedResult, new P021());
        }

        /**
         * Testing P022
         */
        [Fact]
        void testP022()
        {
            const long expectedResult = 871198282;
            solveAndTest(expectedResult, new P022());
        }

        /**
         * Testing P023
         */
        [Fact]
        void testP023()
        {
            const long expectedResult = 4179871;
            solveAndTest(expectedResult, new P023());
        }

        /**
         * Testing P024
         */
        [Fact]
        void testP024()
        {
            const long expectedResult = 2783915460L;
            solveAndTest(expectedResult, new P024());
        }

        /**
         * Testing P025
         */
        [Fact]
        void testP025()
        {
            const long expectedResult = 4782;
            solveAndTest(expectedResult, new P025());
        }

    }
}