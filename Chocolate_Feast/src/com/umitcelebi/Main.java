package com.umitcelebi;


public class Main {
    public static void main(String[] args) {
        System.out.println(chocolateFeast(10, 2, 5)); // Expected output 6
        System.out.println(chocolateFeast(12, 4, 4)); // Expected output 3
        System.out.println(chocolateFeast(6, 2, 2));  // Expected output 5
    }

    public static int chocolateFeast(int n, int c, int m) {
        int remainder;
        int taken = n / c;
        int count = taken;
        while(true) {
            int size = taken / m;
            if(size > 0) {
                remainder = taken % m;
                count += size;
                taken = size + remainder;
            }else break;
        }
        return count;
    }
}
