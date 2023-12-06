package com.umitcelebi;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class JimAndTheOrders {
    public static void main (String[] args) {
        System.out.println(jimOrders(List.of(List.of(8,1), List.of(4,2), List.of(5,6), List.of(3,1), List.of(4,3))));
    }

    public static List<Integer> jimOrders(List<List<Integer>> orders) {
        Map<Integer, Integer> serveTime = serveTimes(orders);
        return sortByValue(serveTime);
    }

    public static List<Integer> sortByValue(Map<Integer, Integer> map) {
        List<Map.Entry<Integer, Integer>> list = new ArrayList<>(map.entrySet());
        list.sort(Map.Entry.comparingByValue());
        List<Integer> result = new ArrayList<>();

        for (Map.Entry<Integer, Integer> entry : list) {
            result.add(entry.getKey());
        }
        return result;
    }

    public static Map<Integer, Integer> serveTimes(List<List<Integer>> orders) {
        Map<Integer, Integer> serveTime = new HashMap<>();
        for (int i = 0; i < orders.size(); i++) {
            List<Integer> order = orders.get(i);
            serveTime.put(i + 1, order.get(0) + order.get(1));
        }
        return serveTime;
    }
}
