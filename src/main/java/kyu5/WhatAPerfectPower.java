package kyu5;

public class WhatAPerfectPower {

    public static int[] isPerfectPower(int n) {

        // calculate log2 of n
        int log2of_n = log2(n);

        for (int base = 2; base <= n/2; base++) {
            for (int exponent = 2; exponent <= log2of_n; exponent++) {
                if (isPrimeNumber(exponent)){
                    int powerResult = 1;
                    for (int x = 1; x <= exponent; x++){
                        powerResult *= base;
                    }
                    if(powerResult == n){
                        return new int[]{base, exponent};
                    }
                }
            }
        }


        return null;
    }

    private static boolean isPrimeNumber(int exponent) {
        for (int i = 2; i < exponent / 2; i++) {
            int remainder = exponent % i;
            if (remainder == 0) {
                return false;
            }
        }
        return true;
    }

    private static int log2(int n) {
        return (int) (Math.log(n) / Math.log(2));
    }
}
