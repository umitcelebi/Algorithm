package com.umitcelebi;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        jumpingOnClouds(Arrays.asList(0, 0, 1, 0, 0, 1, 0));
    }

    public static int jumpingOnClouds(List<Integer> c) {
        int count = 0;

        for(int i = 0; i < c.size(); ) {
            if(i + 2 < c.size() && c.get(i + 2) != 1) {
                count++;
                i+=2;
            } else if(i + 1 < c.size() && c.get(i + 1) != 1) {
                count++;
                i+=1;
            }
            else {
                return count;
            }
        }
        return count;
    }
}
