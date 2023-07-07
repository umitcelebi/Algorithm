package com.umitcelebi;


public class Main {
    public static void main(String[] args) {
        superDigit("148",3);
    }
    public static int superDigit(String n, int k) {
        long sum = 0;
        for(int i = 0; i < n.length(); i++) {
            sum += n.charAt(i) - '0';
        }

        sum *= k;
        while(sum >= 10) {
            long temp = sum;
            int sumOfDigits = 0;
            while(temp > 0) {
                sumOfDigits += temp % 10;
                temp = (long)Math.ceil(temp/10f);
            }
            sum = sumOfDigits;
        }
        return (int)sum;
    }
}