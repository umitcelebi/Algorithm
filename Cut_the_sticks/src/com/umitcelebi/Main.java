package com.umitcelebi;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        cutTheSticks(Arrays.asList(4, 5, 10, 8, 11), new ArrayList<>()); // expected List [5, 4, 3, 2, 1]
        cutTheSticks(Arrays.asList(5, 4, 4, 2, 2, 8), new ArrayList<>()); // expected List [6, 4, 2, 1]
        cutTheSticks(Arrays.asList(1, 2, 3, 4, 3, 3, 2, 1), new ArrayList<>()); // expected List [8, 6, 4, 1]
        cutTheSticks(Arrays.asList(1, 13, 3, 8, 14, 9, 4, 4), new ArrayList<>()); // expected List [8, 7, 6, 4, 3, 2, 1]
    }

    public static List<Integer> cutTheSticks(List<Integer> arr, List<Integer> result) {
        if(arr.size() == 0) {
            return result;
        }
        result.add(arr.size());
        List<Integer> list = new ArrayList<>();
        int minVal = Collections.min(arr);
        for (Integer integer : arr) {
            if (integer != minVal) {
                list.add(integer - minVal);
            }
        }
        return cutTheSticks(list, result);
    }
}
