package com.umitcelebi;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ClosestNumbers {
    private static int min = Integer.MAX_VALUE;

    public static void main(String[] args) {
        List<Integer> list = closestNumbers(Arrays.asList(-20, -3916237, -357920, -3620601, 7374819, -7330761, 30, 6246457, -6461594, 266854, -520, -470 ));
        list.forEach(System.out::println);
    }

    public static List<Integer> closestNumbers(List<Integer> arr) {
        return getClosestList(arr);
    }

    public static List<Integer> getClosestList(List<Integer> arr) {
        List<Integer> result = new ArrayList<>();
        List<List<Integer>> subItems = getSubItems(arr);
        for (List<Integer> list : subItems) {
            Integer first = list.get(0);
            Integer second = list.get(1);
            if (second - first == min) {
                result.add(first);
                result.add(second);
            }
        }
        return result;
    }

    public static List<List<Integer>> getSubItems(List<Integer> arr) {
        Collections.sort(arr);
        List<List<Integer>> result = new ArrayList<>();
        for (int i = 0; i < arr.size() - 1; i++) {
            Integer first = arr.get(i);
            Integer second = arr.get(i + 1);
            result.add(Arrays.asList(first, second));
            if (second - first < min) {
                min = second - first;
            }
        }
        return result;
    }
}
