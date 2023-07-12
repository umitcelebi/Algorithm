package com.umitcelebi;

public class Main {
    public static void main(String[] args) {
        decentNumber(11);
        decentNumber(13);
    }

    public static void decentNumber(int n) {
        int result = -1;

        for (int i = 0; i <= n; i++) {
            if (i % 3 == 0 && (n - i) % 5 == 0) {
                result = i;
            }
        }
        if(result == -1) {
            System.out.println(result);
            return;
        }
        System.out.println("5".repeat(result)+"3".repeat(n-result));
    }

}
