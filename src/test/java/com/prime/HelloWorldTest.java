package com.prime;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThat;

public class HelloWorldTest {


        @Test
        public void shouldReturnTrueIfNumberIsPrime() {
            HelloWorld primeNumberFinder = new HelloWorld();
            assertEquals(true, primeNumberFinder.isPrime(2));
        }

        @Test
        public void shouldReturnFalseIfNumberIsComposite() {
            HelloWorld primeNumberFinder = new HelloWorld();
            assertEquals(false, primeNumberFinder.isPrime(4));
        }

        @Test
        public void shouldReturnFalseIfNumberIsOne() {
            HelloWorld primeNumberFinder = new HelloWorld(); // init
            boolean result = primeNumberFinder.isPrime(1); //execution

            assertEquals(false, result); //assertion

            assertThat(result, is(false));
        }

        @Test
        public void shouldReturnTwoPrimeFactorsFor10() {
            HelloWorld primeFactorFinder = new HelloWorld();

            List<Integer> primeFactors =  primeFactorFinder.primeFactors(10);

            assertEquals(2, primeFactors.size());
        }

        @Test
        public void shouldReturnPrimeFactorsFor10() {
            HelloWorld primeFactorFinder = new HelloWorld();

            List<Integer> primeFactors = primeFactorFinder.primeFactors(10);

            assertEquals(Arrays.asList(2, 5), primeFactors);
        }

        @Test
        public void shouldReturnPrimeFactorsFor15() {
            HelloWorld primeFactorFinder = new HelloWorld();

            List<Integer> primeFactors = primeFactorFinder.primeFactors(15);

            assertEquals(Arrays.asList(3,5), primeFactors);
        }

        @Test
        public void shouldReturnPrimeFactorsFor66() {
            HelloWorld primeFactorFinder = new HelloWorld();

            List<Integer> primeFactors = primeFactorFinder.primeFactors(66);

            assertEquals(Arrays.asList(2,3,11), primeFactors);
        }


}