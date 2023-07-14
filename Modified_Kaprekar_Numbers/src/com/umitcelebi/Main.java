package com.umitcelebi;

public class Main {

    public static void main(String[] args) {
        kaprekarNumbers(1,100);
    }

    public static void kaprekarNumbers(int p, int q) {
        boolean isInvalidRange = true;
        for(int i = p; i<=q;i++) {
            if (isKaprekarNumber(i)) {
                System.out.print(i + " ");
                isInvalidRange = false;
            }
        }
        if (isInvalidRange) {
            System.out.println("INVALID RANGE");
        }
    }

    public static int digitSize(long number) {
        int digit = 0;

        while (number > 0) {
            number /= 10;
            digit++;
        }
        return digit;
    }
    public static boolean isKaprekarNumber(int number){
        long sqr = (long) number * number;
        if (sqr == 1) return true;
        int digit = digitSize(sqr);
        double exponent = Math.ceil(digit / 2d);
        int first = (int) (sqr / Math.pow(10,exponent));
        int second = (int) (sqr % Math.pow(10,exponent));

        return number == first + second;
    }
}
