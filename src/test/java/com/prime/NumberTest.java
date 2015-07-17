package com.prime;

import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThat;

public class NumberTest {

    private Number number;

    @Test
    public void shouldReturnTrueIfNumberIsPrime() {
        number = new Number(5);

        boolean actualResult = number.isPrime();
        assertEquals(true, actualResult);
    }

    @Test
    public void shouldReturnFalseIfNumberIsComposite() {
        number = new Number(6);

        boolean actualResult = number.isPrime();
        assertEquals(false, actualResult);
    }

    @Test
    public void shouldReturnFalseIfNumberIsOne() {
        number = new Number(1);

        boolean result = number.isPrime(); //execution
        assertThat(result, is(false));
    }

    @Test
    public void shouldReturnPrimeFactorsFor10() {
        number = new Number(10);

        List<Integer> primeFactors = number.primeFactors();

        assertEquals(Arrays.asList(2, 5), primeFactors);
    }

    @Test
    public void shouldReturnPrimeFactorsFor15() {
        number = new Number(15);

        List<Integer> primeFactors = number.primeFactors();

        assertEquals(Arrays.asList(3, 5), primeFactors);
    }

    @Test
    public void shouldReturnPrimeFactorsFor66() {
        number = new Number(66);

        List<Integer> primeFactors = number.primeFactors();

        assertEquals(Arrays.asList(2, 3, 11), primeFactors);
    }
}