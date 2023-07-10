package com.umitcelebi;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        climbingLeaderboard(Arrays.asList(100, 100, 50, 40, 40, 20, 10), Arrays.asList(5, 25, 50, 120));
        climbingLeaderboard(Arrays.asList(100, 90, 90, 80, 75, 60), Arrays.asList(50, 65, 77, 90, 102));
    }

    public static List<Integer> climbingLeaderboard(List<Integer> ranked, List<Integer> player) {
        List<Integer> result = new ArrayList<>();

        Set<Integer> uniqueRanked = new HashSet<>(ranked);
        List<Integer> uniqueRankedList = new ArrayList<>(uniqueRanked);
        uniqueRankedList.sort(Comparator.reverseOrder());

        int leaderboardSize = uniqueRankedList.size();
        int leaderboardIndex = leaderboardSize - 1;

        for (int score : player) {
            while (leaderboardIndex >= 0 && score >= uniqueRankedList.get(leaderboardIndex)) {
                leaderboardIndex--;
            }

            result.add(leaderboardIndex + 2);
        }
        return result;
    }
}
