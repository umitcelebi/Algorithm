package com.umitcelebi;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        minimumDistances(List.of(3,2,1,2,3));
    }

    public static int minimumDistances(List<Integer> a) {
        Map<Integer, Integer> lastIndex = new HashMap<>();
        int min = Integer.MAX_VALUE;

        for (int i = 0; i < a.size(); i++) {
            Integer item = a.get(i);
            if (lastIndex.containsKey(item)) {
                min = Math.min(min,i - lastIndex.get(item));
                lastIndex.put(item, i);
            }else {
                lastIndex.put(item,i);
            }
        }
        System.out.println(min);
        return min == Integer.MAX_VALUE ? -1 : min;
    }
}
