package com.umitcelebi;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args) {

        System.out.println(migratoryBirds(Arrays.asList(1,2,3,4,5,4,3,2,1,3,4)));

    }

    public static int migratoryBirds(List<Integer> arr) {
        Map<Integer,Integer> arrMap = new HashMap<>();
        int maxValue = 0;
        int result = Integer.MAX_VALUE;
        for (Integer integer : arr) {
            if (arrMap.containsKey(integer)) {
                arrMap.put(integer, arrMap.get(integer) + 1);
            } else {
                arrMap.put(integer, 1);
            }
        }

        for(Integer i : arrMap.values()) {
            if(i > maxValue) {
                maxValue = i;
            }
        }

        for(Map.Entry<Integer, Integer> entrySet : arrMap.entrySet()) {
            if(entrySet.getValue() == maxValue && entrySet.getKey() < result) {
                result = entrySet.getKey();
            }
        }
        return result;
    }
}

