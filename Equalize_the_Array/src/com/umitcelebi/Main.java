package com.umitcelebi;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class Main {
    public static void main(String[] args) {

        equalizeArray(Arrays.asList(3, 3, 2, 1, 3)); // expected output is 2
        equalizeArray(Arrays.asList(56, 70, 70, 56, 56, 56, 56, 70, 56, 56, 70, 70, 70, 70, 70, 70, 70, 56, 56, 70,
                70, 56, 56, 56, 70, 70, 56, 70, 70, 70, 56, 56, 70, 56)); // expected output is 16
        equalizeArray(Arrays.asList(32, 32, 37, 72, 72, 96, 12, 32, 67, 37, 57, 18, 57, 78, 29, 34, 67, 16, 34, 78,
                72, 33, 96, 16, 37, 32, 87, 43, 29, 16, 48, 49, 29, 37, 32)); // expected output is 30
    }

    public static int equalizeArray(List<Integer> arr) {
        int max = 0;
        Map<Integer, Integer> map = new HashMap<>();
        for(Integer number : arr) {
            if(map.containsKey(number)) {
                map.put(number, map.get(number) + 1);
            } else {
                map.put(number, 1);
            }
        }

        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (entry.getValue() > max) {
                max = entry.getValue();
            }
        }

        return arr.size() - max;
    }
}
