package com.umitcelebi;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Set;

public class Main {

    public static void main(String[] args) {
        knightlOnAChessboard(5);
        knightlOnAChessboard(11);
    }

    public static List<List<Integer>> knightlOnAChessboard(int n) {
        List<List<Integer>> result = new ArrayList<>();
        for (int i = 1; i < n; i++) {
            List<Integer> item = new ArrayList<>();
            for (int j = 1; j < n; j++) {
                Set<Move> set = new HashSet<>();
                item.add(findMinimalQueue(n,new PriorityQueue<>(),i,j,0,set));
            }
            result.add(item);
        }

        return result;
    }

    public static int findMinimalQueue(int n, Queue<List<Move>> queues, int a, int b, int denemeSayisi,Set<Move> set) {

        if (denemeSayisi > n * n) return -1;
        Queue<List<Move>> newQueue = new ArrayDeque<>();

        List<Move> directions = List.of(
                new Move(a, b),
                new Move(b, a),
                new Move(a, -b),
                new Move(b, -a),
                new Move(-b, a),
                new Move(-b, -a),
                new Move(-a, b),
                new Move(-a, -b)
        );

        if (queues.isEmpty()) {
            for (int i = 0; i < 2; i++) {
                int xStep = directions.get(i).getX();
                int yStep = directions.get(i).getY();
                if (xStep == n -1 && yStep == n - 1) {
                    return 1;
                }

                newQueue.add(List.of(new Move(xStep, yStep)));
            }
        } else {
            while (!queues.isEmpty()) {
                List<Move> coordinates = queues.poll();
                Move lastCoordinate = coordinates.get(coordinates.size() - 1);
                int lastCoordinateX = lastCoordinate.getX();
                int lastCoordinateY = lastCoordinate.getY();
                for (int j = 0; j < directions.size(); j++) {
                    int dirX = directions.get(j).getX();
                    int dirY = directions.get(j).getY();
                    int newX = lastCoordinateX + dirX;
                    int newY = lastCoordinateY + dirY;
                    List<Move> newCoordinates = new ArrayList<>(coordinates);
                    if (isValid(newX,newY,n) && !set.contains(new Move(newX,newY))) {
                        newCoordinates.add(new Move(newX,newY));
                        newQueue.add(newCoordinates);
                        set.add(new Move(newX, newY));
                    }
                    if (newX == n-1 && newY == n -1) {
                        return newCoordinates.size();
                    }
                }
            }
        }
        return findMinimalQueue(n,newQueue,a,b,++denemeSayisi, set);
    }

    public static boolean isValid(int x, int y, int n) {
        return x < n && y < n && x >= 0 && y >= 0;
    }
}
