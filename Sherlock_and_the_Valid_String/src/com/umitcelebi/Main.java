package com.umitcelebi;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;

public class Main {
    static Map<Character, Integer> charMap = new HashMap<>();

    public static void main(String[] args) {

        isValid("aabbcd");
        isValid("aabbc");
        isValid("aaaaabc");
        isValid("xxxaabbccrry");
    }

    public static String isValid(String s) {
        if (s.length() < 2) return "YES";

        countCharNumber(s);

        int sumFromFirst = 0;
        int sumFromLast = 0;

        List<Integer> integers = sortMapValues();
        for (int i = 1; i < integers.size(); i++) {
            if (!Objects.equals(integers.get(i), integers.get(0))) {
                sumFromFirst += integers.get(i) - integers.get(0);
            }
            if (!Objects.equals(integers.get(integers.size() - 1), integers.get(i - 1))) {
                sumFromLast += integers.get(i - 1);
            }
            if (sumFromFirst > 1 && sumFromLast > 1) {
                return "NO";
            }
        }
        return "YES";
    }

    public static void countCharNumber(String s) {
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (charMap.containsKey(c)) {
                charMap.put(c, charMap.get(c) + 1);
            }else {
                charMap.put(c, 1);
            }
        }
    }

    public static List<Integer> sortMapValues() {
        List<Integer> values = new ArrayList<>(charMap.values());
        Collections.sort(values);
        return values;
    }
}
