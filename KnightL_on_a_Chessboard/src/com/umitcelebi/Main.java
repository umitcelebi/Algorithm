package com.umitcelebi;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Queue;

public class Main {

    public static void main(String[] args) {
        System.out.println(knightlOnAChessboard(7));
    }

    public static List<List<Integer>> knightlOnAChessboard(int n) {
        List<List<Integer>> result = new ArrayList<>();
        for (int i = 1; i < n; i++) {
            List<Integer> item = new ArrayList<>();
            for (int j = 1; j < n; j++) {
                item.add(findMinimalQueue(n,new PriorityQueue<>(),i,j,0));
            }
            result.add(item);
        }

        return result;
    }

    public static int findMinimalQueue2(int n, List<List<Integer>> lastCoordinates, int a, int b, int denemeSayisi) {

        if (denemeSayisi > n * n) return -1;
        List<List<Integer>> removedCoordinates = new ArrayList<>();

        List<List<Integer>> directions = List.of(
                List.of(a, b),
                List.of(b, a),
                List.of(a, -b),
                List.of(b, -a),
                List.of(-b, a),
                List.of(-b, -a),
                List.of(-a, b),
                List.of(-a, -b)
        );

        if (lastCoordinates.isEmpty()) {
            for (int i = 0; i < 2; i++) {
                int hareketEdilecekX = directions.get(i).get(0);
                int hareketEdilecekY = directions.get(i).get(1);
                if (hareketEdilecekX == n -1 && hareketEdilecekY == n - 1) {
                    return ++denemeSayisi;
                }
                List<Integer> initialCoordinate = List.of(hareketEdilecekX, hareketEdilecekY);
                lastCoordinates.add(initialCoordinate);
            }
        } else {

            int coordinatesSize = lastCoordinates.size();
            for (int i = 0; i < coordinatesSize; i++) {
                List<Integer> coordinates = lastCoordinates.get(0);
                lastCoordinates.remove(0);
                int lastCoordinateX = coordinates.get(0);
                int lastCoordinateY = coordinates.get(1);
                for (int j = 0; j < directions.size(); j++) {
                    int dirX = directions.get(j).get(0);
                    int dirY = directions.get(j).get(1);
                    int newX = lastCoordinateX + dirX;
                    int newY = lastCoordinateY + dirY;
                    Move move = new Move(newX, newY);
                    if (newX < n && newY < n && newX >= 0 && newY >= 0) {
                        lastCoordinates.add(List.of(newX, newY));
                    }
                    if (newX == n-1 && newY == n -1) {
                        return denemeSayisi;
                    }
                }
            }
        }
        return findMinimalQueue2(n,lastCoordinates,a,b,++denemeSayisi);
    }


    public static int findMinimalQueue(int n, Queue<List<List<Integer>>> queues, int a, int b, int denemeSayisi) {

        if (denemeSayisi > n * n) return -1;
        Queue<List<List<Integer>>> newQueue = new ArrayDeque<>();

        List<List<Integer>> directions = List.of(
                List.of(a, b),
                List.of(b, a),
                List.of(a, -b),
                List.of(b, -a),
                List.of(-b, a),
                List.of(-b, -a),
                List.of(-a, b),
                List.of(-a, -b)
        );

        if (queues.isEmpty()) {
            for (int i = 0; i < 2; i++) {
                int hareketEdilecekX = directions.get(i).get(0);
                int hareketEdilecekY = directions.get(i).get(1);
                List<List<Integer>> initialCoordinate = List.of(List.of(hareketEdilecekX, hareketEdilecekY));
                newQueue.add(initialCoordinate);
                if (hareketEdilecekX == n -1 && hareketEdilecekY == n - 1) {
                    return initialCoordinate.size();
                }
            }
        } else {
            while (!queues.isEmpty()) {
                List<List<Integer>> coordinates = queues.poll();
                List<Integer> lastCoordinate = coordinates.get(coordinates.size() - 1);
                int lastCoordinateX = lastCoordinate.get(0);
                int lastCoordinateY = lastCoordinate.get(1);
                for (int j = 0; j < directions.size(); j++) {
                    int dirX = directions.get(j).get(0);
                    int dirY = directions.get(j).get(1);
                    int newX = lastCoordinateX + dirX;
                    int newY = lastCoordinateY + dirY;
                    List<List<Integer>> newCoordinates = new ArrayList<>(coordinates);
                    if (newX < n && newY < n && newX >= 0 && newY >= 0 && !coordinates.contains(List.of(newX,newY))) {
                        newCoordinates.add(List.of(newX, newY));
                        newQueue.add(newCoordinates);
                    }
                    if (newX == n-1 && newY == n -1) {
                        return newCoordinates.size();
                    }
                }
            }
        }
        return findMinimalQueue(n,newQueue,a,b,++denemeSayisi);
    }
}
