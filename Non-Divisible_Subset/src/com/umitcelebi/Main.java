package com.umitcelebi;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        System.out.println(nonDivisibleSubset(3,List.of(1,7,2,4)));
        System.out.println(nonDivisibleSubset(7,List.of(278, 576, 496, 727, 410, 124, 338, 149, 209, 702, 282, 718, 771, 575, 436)));

    }

    public static int nonDivisibleSubset(int k, List<Integer> s) {
        int[] remainders = remainders(k, s);

        int result = Math.min(remainders[0],1);
        for (int i = 1; i <= remainders.length / 2; i++) {
            if (i == k - i) {
                result += Math.min(1, remainders[i]);
            } else {
                result += Math.max(remainders[i], remainders[k - i]);
            }
        }
        return result;
    }

    public static int[] remainders(int k, List<Integer> s) {
        int[] remainder = new int[k];

        for (Integer integer : s) {
            remainder[integer % k]++;
        }
        return remainder;
    }
}
