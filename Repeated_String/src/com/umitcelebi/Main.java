package com.umitcelebi;

public class Main {
    public static void main(String[] args) {
        repeatedString("aba", 10); // expected output 7
        repeatedString("aab", 882787); // expected output 588525
        repeatedString("ceebbcb", 817723); // expected output 0
        repeatedString("gfcaaaecbg", 547602); // expected output 164280
    }

    public static long repeatedString(String s, long n) {
        long length = s.length();
        long repeatNumber = n / length;
        long remainder = n % length;
        long stringHasA = 0;
        long reminderHasA = 0;
        long result;
        for(int i = 0; i < length; i++) {
            if(s.charAt(i) == 'a') {
                stringHasA++;
            }
        }

        if(remainder != 0) {
            String remainderStr = s.substring(0, (int)remainder);
            for(int i = 0; i < remainderStr.length(); i++) {
                if(remainderStr.charAt(i) == 'a') {
                    reminderHasA++;
                }
            }
        }
        result = stringHasA * repeatNumber + reminderHasA;

        return result;
    }
}
