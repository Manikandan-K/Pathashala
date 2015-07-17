package com.prime;

import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThat;

public class HelloWorldTest {


    private HelloWorld primeFactorFinder;

    @Before
    public void setUp() throws Exception {
        primeFactorFinder = new HelloWorld();
    }

    @Test
    public void shouldReturnTrueIfNumberIsPrime() {
        assertEquals(true, primeFactorFinder.isPrime(2));
    }

    @Test
    public void shouldReturnFalseIfNumberIsComposite() {
        assertEquals(false, primeFactorFinder.isPrime(4));
    }

    @Test
    public void shouldReturnFalseIfNumberIsOne() {
        boolean result = primeFactorFinder.isPrime(1); //execution

        assertEquals(false, result); //assertion

        assertThat(result, is(false));
    }

    @Test
    public void shouldReturnTwoPrimeFactorsFor10() {
        List<Integer> primeFactors = primeFactorFinder.primeFactors(10);

        assertEquals(2, primeFactors.size());
    }

    @Test
    public void shouldReturnPrimeFactorsFor10() {


        List<Integer> primeFactors = primeFactorFinder.primeFactors(10);

        assertEquals(Arrays.asList(2, 5), primeFactors);
    }

    @Test
    public void shouldReturnPrimeFactorsFor15() {
        List<Integer> primeFactors = primeFactorFinder.primeFactors(15);

        assertEquals(Arrays.asList(3, 5), primeFactors);
    }

    @Test
    public void shouldReturnPrimeFactorsFor66() {
        List<Integer> primeFactors = primeFactorFinder.primeFactors(66);

        assertEquals(Arrays.asList(2, 3, 11), primeFactors);
    }


}