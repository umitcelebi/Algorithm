package com.umitcelebi;

import java.math.BigInteger;

public class Main {
    public static void main(String[] args) {
        fibonacciModified(0, 1, 5);
        fibonacciModified(0, 1, 10);
    }

    public static BigInteger fibonacciModified(int t1, int t2, int n) {
        BigInteger temp;
        int i = 0;
        BigInteger t2_2 = BigInteger.valueOf(t2);
        BigInteger t1_2 = BigInteger.valueOf(t1);
        while(i < n - 2) {
            temp = t2_2;
            t2_2 = t2_2.pow(2).add(t1_2);
            t1_2 = temp;
            i++;
        }
        System.out.println(t2_2);
        return t2_2;
    }
}
