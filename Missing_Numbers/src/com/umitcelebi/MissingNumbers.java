package com.umitcelebi;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MissingNumbers {

    public static void main(String[] args) {

        List<Integer> list = missingNumbers(Arrays.asList(203, 204, 205, 206, 207, 208, 203, 204, 205, 206),
                        Arrays.asList(203, 204, 204, 205, 206, 207, 205, 208, 203, 206, 205, 206, 204));

        System.out.println(Arrays.toString(list.toArray()));
    }

    public static List<Integer> missingNumbers(List<Integer> arr, List<Integer> brr) {
        List<Integer> result = new ArrayList<>();
        Map<Integer, Integer> arrMap = new HashMap<>();
        Map<Integer, Integer> brrMap = new HashMap<>();

        for (Integer i : arr) {
            if (arrMap.containsKey(i)) {
                arrMap.put(i, arrMap.get(i) + 1);
            }else {
                arrMap.put(i, 1);
            }
        }
        for (Integer i : brr) {
            if (brrMap.containsKey(i)) {
                brrMap.put(i, brrMap.get(i) + 1);
            }else {
                brrMap.put(i, 1);
            }
        }

        for (Map.Entry<Integer, Integer> entry : brrMap.entrySet()) {
            Integer key = entry.getKey();
            Integer integer = arrMap.get(key);
            integer = integer == null ? 0 : integer;
            int fark = entry.getValue() - integer;
            if (fark != 0)
                result.add(key);
        }

        return result;
    }
}
