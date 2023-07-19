package com.umitcelebi;

import java.util.List;

public class Main {

    public static void main(String[] args) {
        balancedSums(List.of(1, 2, 3));
        balancedSums(List.of(0, 0, 2, 0));
        balancedSums(List.of(2, 0, 0, 0));
    }

    public static String balancedSums(List<Integer> arr) {

        int sumTotalArr = sumArray(arr);

        int sum = 0;

        for (Integer integer : arr) {
            if (sum == sumTotalArr - integer - sum) {
                return "YES";
            }
            sum += integer;
        }
        return "NO";
    }

    public static int sumArray(List<Integer> arr) {
        int result = 0;
        for (Integer i: arr) {
            result += i;
        }
        return result;
    }
}
