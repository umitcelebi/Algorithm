package com.umitcelebi;


public class Main {
    public static void main(String[] args) {
        countingValleys(8, "UDDDUDUU");
        countingValleys(100,
                "DDUDUDDUDDUDDUUUUDUDDDUUDDUUDDDUUDDUUUUUUDUDDDDUDDUUDUUDUDUUUDUUUUUDDUDDDDUDDUDDDDUUUUDUUDUUDUUDUDDD"); // Expected output 5
    }
    public static int countingValleys(int steps, String path) {
        int count = 0;
        int deep = 0;
        for (int i = 0; i < steps; i++) {
            int step = charToInt(path.charAt(i));
            if(deep < 0 && deep + step == 0) {
                count++;
            }
            deep += step;
        }
        return count;
    }

    public static int charToInt(char ch) {
        if(ch == 'U') {
            return 1;
        } else if(ch == 'D') {
            return -1;
        }
        return 0;
    }
}
