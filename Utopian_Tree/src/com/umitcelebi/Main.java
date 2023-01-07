package com.umitcelebi;

public class Main {
    public static void main(String[] args) {
        System.out.println(utopianTree(4));
        System.out.println(utopianTree(0));
        System.out.println(utopianTree(3));
    }

    public static int utopianTree(int n) {
        int result = 1;
        if(n == 0) {
            return result;
        }
        for(int i = 1; i <= n; i++) {
            if( i % 2 == 0) {
                result++;
            } else {
                result *= 2;
            }
        }

        return result;
    }

}