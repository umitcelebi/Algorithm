package com.umitcelebi;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        insertionSort(7, Arrays.asList(3, 4, 7, 5, 6, 2, 1));
    }

    public static void insertionSort(int n, List<Integer> arr) {
        int a;
        for(int i = 1; i < n; i++) {
            for(int j = i; j > 0; j--) {
                if(arr.get(j) < arr.get(j - 1)){
                    a = arr.get(j);
                    arr.set(j,arr.get(j - 1));
                    arr.set(j - 1, a);
                } else {
                    break;
                }
            }
            arr.forEach(b-> System.out.print(b + " "));
            System.out.println();
        }
    }
}
