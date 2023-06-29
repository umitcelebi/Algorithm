package com.umitcelebi;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * User: ucelebi
 * Date: 30.06.2023
 * Time: 02:37
 */
public class Main {
    public static void main(String[] args) {

        circularArrayRotation(Arrays.asList(1, 2, 3), 1, Arrays.asList(0, 1, 2));

    }
    public static List<Integer> circularArrayRotation(List<Integer> a, int k, List<Integer> queries) {
        List<Integer> list = new ArrayList<>();
        List<Integer> result = new ArrayList<>();
        list.addAll(a.subList(a.size()-k, a.size()));
        list.addAll(a.subList(0, a.size()-k));

        for(Integer i : queries) {
            result.add(list.get(i));
        }
        return result;
    }
}
