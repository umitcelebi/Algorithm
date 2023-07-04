package com.umitcelebi;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {

    static Map<Character, Integer> alphabetMap = new HashMap<>();

    static {
        String alphabet = "abcdefghijklmnopqrstuvwxyz";
        for(int i = 1; i <= alphabet.length(); i++) {
            alphabetMap.put(alphabet.charAt(i - 1), i);
        }
    }
    public static void main(String[] args) {
        fillAlfabe();
        weightedUniformStrings("aaabbbbcccddd", Arrays.asList(9, 7, 8, 12, 5));
    }

    public static List<String> weightedUniformStrings(String s, List<Integer> queries) {
        List<Integer> list = uniformContiguousSubstrings(s);
        List<String> result = new ArrayList<>();
        for (Integer query : queries) {
            String element = list.contains(query) ? "Yes" : "No";
            result.add(element);
        }
        return result;
    }

    public static List<Integer> uniformContiguousSubstrings(String s) {
        List<Integer> list = new ArrayList<>();
        int count = 1;
        for(int i = 0; i < s.length(); i++) {
            list.add(count * alphabetMap.get(s.charAt(i)));
            if(i <= s.length() - 2 && s.charAt(i) == s.charAt(i + 1)){
                count++;
            } else if(i <= s.length() - 2 && s.charAt(i) != s.charAt(i + 1)){
                count = 1;
            }
        }
        return list;
    }

    public static void fillAlfabe() {

    }
}
