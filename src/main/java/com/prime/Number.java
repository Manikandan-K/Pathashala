package com.prime;

import java.util.ArrayList;
import java.util.List;

public class Number {

    private int value;

    public Number(int value) {
        this.value = value;
    }

    public boolean isPrime(){
        if(value == 1)
            return false;
        return isPrime(value);
    }

    public List<Integer> primeFactors() {
        ArrayList<Integer> primeFactors = new ArrayList<Integer>();
        for(int i=2; i <= value/2 ; i++) {
            if(isFactor(i, this.value) && isPrime(i))
                primeFactors.add(i);
        }
        return primeFactors;
    }

    private boolean isPrime(int numberToCheckForPrimality) {
        int largestFactor = (int)Math.sqrt(numberToCheckForPrimality);
        for(int i=2; i<=largestFactor; i++){
            if(isFactor(i, numberToCheckForPrimality)) {
                return false;
            }
        }
        return true;
    }

    private boolean isFactor(int i, int number) {
        return number % i == 0;
    }

}
