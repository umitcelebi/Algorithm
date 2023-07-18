package com.umitcelebi;

import java.util.List;
import java.util.Stack;

/**
 * User: ucelebi
 * Date: 18.07.2023
 * Time: 13:13
 */
public class SecondWay {

    static Stack<List<Integer>> directions = new Stack<>();
    static {
        directions.push(List.of(0, 1));
        directions.push(List.of(0, -1));
        directions.push(List.of(1, 0));
        directions.push(List.of(-1, 0));
        directions.push(List.of(1, 1));
        directions.push(List.of(1, -1));
        directions.push(List.of(-1, -1));
        directions.push(List.of(-1, 1));
    }

    public static void main(String[] args) {
        System.out.println(queensAttack(5,3,4,3,List.of(List.of(5,5),List.of(4,2),List.of(2,3))));
        System.out.println(queensAttack(4,0,4,4,List.of()));
    }

    public static int queensAttack(int n, int k, int r_q, int c_q, List<List<Integer>> obstacles) {
        if (k == 0) return findAllSteps(n,r_q,c_q);
        return calculate(n,r_q,c_q,obstacles, directions,1,0);
    }

    public static int calculate(int n, int r_q, int c_q, List<List<Integer>> obstacles,Stack<List<Integer>> dir, int step, int result) {
        int count = result;
        if (dir.size() == 0) return count;
        Stack<List<Integer>> newDirection = new Stack<>();
        while (!dir.isEmpty()) {
            List<Integer> coordinate = dir.pop();
            int rowMove = step * coordinate.get(0);
            int columnMove = step * coordinate.get(1);
            int newR_Q = r_q + rowMove;
            int newC_Q = c_q + columnMove;
            if (!(newR_Q > n || newC_Q > n || newR_Q < 1 || newC_Q < 1) && !obstacles.contains(List.of(newR_Q, newC_Q))) {
                count++;
                newDirection.push(coordinate);
            }
        }
        return calculate(n,r_q,c_q,obstacles,newDirection,++step,count);
    }

    public static int findAllSteps(int n, int r_q, int c_q) {
        int right = n - c_q;
        int left = c_q - 1;
        int up = n - r_q;
        int down = r_q - 1;
        return left + right + up + down + Math.min(down, left) + Math.min(up, left) + Math.min(down, right) + Math.min(up, right);
    }
}
