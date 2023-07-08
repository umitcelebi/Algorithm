package com.umitcelebi;


public class Main {
    public static void main(String[] args) {
        counterGame(132);
    }

    public static String counterGame(long n) {
        if(n == 1) return "Richard";
        int turn = 0;

        while(n > 1) {
            long pow = (int)(Math.floor(((Math.log(n) / Math.log(2)))));

            if(isPowerOfTwo(n)) {
                n /= 2;
            }else {
                n = n - (long)Math.pow(2,pow);
            }
            turn++;
        }
        return turn % 2 == 0 ? "Richard" : "Louise";
    }

    static boolean isPowerOfTwo(long n)
    {
        double pow = Math.log(n) / Math.log(2);
        return (int)(Math.ceil(pow)) == (int)(Math.floor(pow));
    }

}
