package com.umitcelebi;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {

    public static void main(String[] args) {
        System.out.println(queensAttack(5,4,3,List.of(List.of(5,5),List.of(4,2),List.of(2,3))));
        System.out.println(queensAttack(4,4,4,List.of()));
    }

    public static int queensAttack(int n, int r_q, int c_q, List<List<Integer>> obstacles) {
        return findAllSteps(n,r_q,c_q) - findAreasNotGo(n,r_q,c_q,obstacles);
    }

    public static int findAreasNotGo(int n, int r_q, int c_q, List<List<Integer>> obstacles) {
        Map<Integer, Integer> collisions = findNearestCollisions(r_q, c_q, obstacles);
        int sum = 0;
        int step ;
        for (Map.Entry<Integer, Integer> entry : collisions.entrySet()) {
            if (entry.getKey() == 1) {
                step = (n - entry.getValue()) + 1;
                sum += step;
            } else if (entry.getKey() == 2) {
                step = entry.getValue();
                sum += step;
            } else if (entry.getKey() == 3) {
                step = (n + 1 - entry.getValue());
                sum += step;
            } else if (entry.getKey() == 4) {
                step = entry.getValue();
                sum += step;
            } else if (entry.getKey() == 13) {
                int distance = Math.abs(entry.getValue() - c_q);
                int r = r_q + distance;
                int c = c_q + distance;
                int max = Math.max(r,c);
                step = n - max + 1;
                sum += step;
            } else if (entry.getKey() == 14) {
                int distance = Math.abs(entry.getValue() - c_q);
                int r = r_q + distance;
                int c = c_q - distance;
                step = Math.min(c, n + 1 - r);
                sum += step;
            } else if (entry.getKey() == 23) {
                int distance = Math.abs(entry.getValue() - c_q);
                int r = r_q - distance;
                int c = c_q + distance;
                step = Math.min(n + 1 - c, r);
                sum += step;
            } else if (entry.getKey() == 24) {
                int distance = Math.abs(entry.getValue() - c_q);
                int r = r_q - distance;
                int c = c_q - distance;
                step = Math.min(c, r);
                sum += step;
            }
        }
        return sum;
    }

    /**
     *
     * @param r_q the row number of the queen's position
     * @param c_q the column number of the queen's position
     * @param obstacles each element is an array of 2 integers, the row and column of an obstacle
     * @return the nearest obstacle in the all directions
     * Map keys: {1: North, 2: South, 3:East, 4: West, 13:Northeast, 14: Northwest, 23: Southeast, 24: Southwest}
     */
    public static Map<Integer, Integer> findNearestCollisions(int r_q, int c_q, List<List<Integer>> obstacles ) {
        Map<Integer, Integer> map = new HashMap<>();


        for (List<Integer> obstacle : obstacles) {
            int r = obstacle.get(0);
            int c = obstacle.get(1);
            if (c == c_q && r < r_q) {                      //SOUTH
                if (map.containsKey(2))
                    map.put(2, Math.max(r, map.get(2)));
                else
                    map.put(2, r);
            } else if (c == c_q && r > r_q) {               //NORTH
                if (map.containsKey(1))
                    map.put(1, Math.min(r, map.get(1)));
                else
                    map.put(1, r);
            } else if (r == r_q && c < c_q) {               //WEST
                if (map.containsKey(4))
                    map.put(4, Math.max(c, map.get(4)));
                else
                    map.put(4, c);
            } else if (r == r_q && c > c_q) {               //EAST
                if (map.containsKey(3))
                    map.put(3, Math.min(c, map.get(3)));
                else
                    map.put(3, c);
            } else {
                boolean isValid = Math.abs(c - c_q) == Math.abs(r - r_q);
                if (isValid && r > r_q && c < c_q) {        //NORTHWEST
                    if (map.containsKey(14))
                        map.put(14, Math.max(c, map.get(14)));
                    else
                        map.put(14, c);
                } else if (isValid && r > r_q) { //NORTHEAST
                    if (map.containsKey(13))
                        map.put(13, Math.min(c, map.get(13)));
                    else
                        map.put(13, c);
                } else if (isValid && r < r_q && c < c_q) { //SOUTHWEST
                    if (map.containsKey(24))
                        map.put(24, Math.max(c, map.get(24)));
                    else
                        map.put(24, c);
                } else if (isValid && r < r_q) { //SOUTHEAST
                    if (map.containsKey(23))
                        map.put(23, Math.min(c, map.get(23)));
                    else
                        map.put(23, c);
                }
            }
        }
        return map;
    }

    public static int findAllSteps(int n, int r_q, int c_q) {
        int right = n - c_q;
        int left = c_q - 1;
        int up = n - r_q;
        int down = r_q - 1;
        return left + right + up + down + Math.min(down, left) + Math.min(up, left) + Math.min(down, right) + Math.min(up, right);
    }
}
