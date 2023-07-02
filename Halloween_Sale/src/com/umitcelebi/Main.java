package com.umitcelebi;

public class Main {
    public static void main(String[] args) {
        howManyGames(20,3,6,80);         // Expected output 6
        howManyGames(1, 55, 1, 10000);  // Expected output 10000
    }

    public static int howManyGames(int p, int d, int m, int s) {
        int count = 0;
        int budget = s;
        while (budget >= p) {
            budget -= p;
            count++;
            p = Math.max(p - d, m);
        }
        return count;
    }
}
