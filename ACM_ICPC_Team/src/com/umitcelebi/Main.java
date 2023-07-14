package com.umitcelebi;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        acmTeam(Arrays.asList("10101", "11100", "11010", "00101"));
    }

    public static List<Integer> acmTeam(List<String> topic) {
        Map<Integer, Integer> map = new HashMap<>();

        for(int i = 0; i < topic.size() - 1; i++) {
            for(int j = i + 1; j < topic.size(); j++) {
                putAndIncreaseMap(map, calculateTeamSubject(topic.get(i),
                        topic.get(j)));
            }
        }
        System.out.println(map);

        return calculateMaxSubjectAndTeamSize(map);
    }
    public static List<Integer> calculateMaxSubjectAndTeamSize(Map<Integer, Integer> map) {
        int max = 0;
        for(Map.Entry<Integer, Integer> entry: map.entrySet()) {
            if(entry.getKey() > max) {
                max = entry.getKey();
            }
        }
        return Arrays.asList(max, map.get(max));
    }

    public static void putAndIncreaseMap(Map<Integer, Integer> map, int count) {
        if(map.containsKey(count)) {
            map.put(count, map.get(count) + 1);
        } else {
            map.put(count, 1);
        }
    }

    public static int calculateTeamSubject(String teamOne, String teamTwo) {
        int count = 0;
        for(int j = 0; j < teamOne.length(); j++) {
            if(teamOne.charAt(j) == '1' || teamTwo.charAt(j) == '1') {
                count++;
            }
        }
        return count;
    }
}
