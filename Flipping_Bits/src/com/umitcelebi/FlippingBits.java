package com.umitcelebi;

import java.math.BigInteger;

public class FlippingBits {
    public static void main(String[] args) {
        System.out.println(flippingBits(2147483647));
    }

    public static long flippingBits(long n) {
        String baseTwo = changeBaseFromTen(new BigInteger(String.valueOf(n)), "2");
        String replaced = replaceOneAndZero(baseTwo);
        return changeBaseToTen(replaced);
    }

    public static String replaceOneAndZero(String str) {
        StringBuilder builder = new StringBuilder();
        for (Character c : str.toCharArray()) {
            if (c == '0') {
                builder.append("1");
            }else {
                builder.append("0");
            }
        }
        return builder.toString();
    }

    public static Long changeBaseToTen(String number) {
        int length = number.length() - 1;
        long result = 0;
        for (int i = 0; i <= length; i++) {
            result += Integer.parseInt(number.substring(i, i + 1)) * Math.round(Math.pow(2d,(length - i)));
        }
        return result;
    }
    public static String changeBaseFromTen(BigInteger number, String base) {
        StringBuilder builder = new StringBuilder();

        while (number.compareTo(BigInteger.ZERO) > 0) {
            builder.append(number.mod(new BigInteger(base)));
            number = number.divide(new BigInteger(base));
        }
        int length = builder.length();
        if (length != 32) {
            int i = 32 - length;
            builder.insert(length,"0".repeat(i));
        }
        return builder.reverse().toString();
    }
}
