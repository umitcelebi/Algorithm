package com.umitcelebi;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        insertionSort1(10, Arrays.asList(2, 3, 4, 5, 6, 7, 8, 9, 10, 1));
    }

    public static void insertionSort1(int n, List<Integer> arr) {
        int temp;
        for(int i = n - 1; i >= 1; i--) {
            if(arr.get(i) < arr.get(i - 1)) {
                for (int j = 0; j < n; j++) {
                    if (i == j) {
                        System.out.print(arr.get(j - 1) + " ");
                    } else {
                        System.out.print(arr.get(j) + " ");
                    }
                }
                temp = arr.get(i);
                arr.set(i, arr.get(i - 1));
                arr.set(i - 1, temp);
            } else {
                break;
            }
            System.out.println();
        }
        arr.forEach( a -> System.out.print(a + " "));
    }
}
