package com.umitcelebi;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {

        int[] c = new int[] {0,1,5};
        System.out.println(flatlandSpaceStations(6, c));
        System.out.println(flatlandSpaceStations(9, c));
    }

    static int flatlandSpaceStations(int n, int[] c) {
        int result = 0;

        if (n == c.length) {
            return  result;
        }
        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < n; i++) {
            for (int k : c) {
                if (i == k) {
                    map.remove(i);
                    break;
                }
                if (!map.containsKey(i) | (map.containsKey(i) && map.get(i) > Math.abs(k - i))) {
                    map.put(i, Math.abs(k - i));
                }
            }
        }
        Map.Entry<Integer, Integer> maxEntry = null;
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (maxEntry == null || entry.getValue()
                    .compareTo(maxEntry.getValue()) > 0) {
                maxEntry = entry;
            }
        }

        return map.entrySet()
                .stream()
                .max(Map.Entry.comparingByValue()).get().getValue();
    }
}
