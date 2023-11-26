package com.umitcelebi;

public class AndProduct {
    public static void main(String[] args) {
        System.out.println(andProduct(12,15));
        System.out.println(andProduct(2,3));
        System.out.println(andProduct(8,13));
        System.out.println(andProduct(16,31));
    }

    public static long andProduct(long a, long b) {
        long result = a;
        for(long i = a; i <= b; i++) {
            result = result & i;
        }
        return result;
    }
}
