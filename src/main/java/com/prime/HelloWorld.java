package com.prime;

import java.util.ArrayList;
import java.util.List;

public class HelloWorld {

    public boolean isPrime(int number){
        int largestFactor = (int)Math.sqrt(number);
        if(number == 1)
            return false;
        for(int i=2; i<=largestFactor; i++){
            if(isFactor(number, i)) {
                return false;
            }
        }
        return true;
    }



    public List<Integer> primeFactors(int number) {
        ArrayList<Integer> primeFactors = new ArrayList<Integer>();
        for(int i=2; i <= number/2 ; i++) {
            if(isFactor(number, i) && isPrime(i))
                primeFactors.add(i);
        }

        return primeFactors;
    }

    private boolean isFactor(int number, int i) {
        return number % i == 0;
    }

}
