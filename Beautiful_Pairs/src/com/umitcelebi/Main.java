package com.umitcelebi;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        beautifulPairs(Arrays.asList(1, 2, 3, 4), Arrays.asList(1, 2, 3, 3));
    }

    public static int beautifulPairs(List<Integer> A, List<Integer> B) {
        int countBeautifulPairs = 0;
        for (Integer integer : A) {
            if (B.contains(integer)) {
                countBeautifulPairs++;
                B.remove(integer);
            }
        }
        countBeautifulPairs+= (countBeautifulPairs==A.size()) ? -1 : 1;
        return countBeautifulPairs;
    }
}
