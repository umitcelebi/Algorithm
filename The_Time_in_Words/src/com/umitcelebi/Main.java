package com.umitcelebi;

import java.util.HashMap;
import java.util.Map;

public class Main {
    static Map<Integer, String> minutesMap = new HashMap<>();
    static Map<Integer, String> hoursMap = new HashMap<>();

    static {
        minutesMap.put(0,"o' clock");
        minutesMap.put(1,"one minute");
        minutesMap.put(2,"two minutes");
        minutesMap.put(3,"three minutes");
        minutesMap.put(4,"four minutes");
        minutesMap.put(5,"five minutes");
        minutesMap.put(6,"six minutes");
        minutesMap.put(7,"seven minutes");
        minutesMap.put(8,"eight minutes");
        minutesMap.put(9,"nine minutes");
        minutesMap.put(10,"ten minutes");
        minutesMap.put(11,"eleven minutes");
        minutesMap.put(12,"twelve minutes");
        minutesMap.put(13,"thirteen minutes");
        minutesMap.put(14,"fourteen minutes");
        minutesMap.put(15,"quarter");
        minutesMap.put(16,"sixteen minutes");
        minutesMap.put(17,"seventeen minutes");
        minutesMap.put(18,"eighteen minutes");
        minutesMap.put(19,"nineteen minutes");
        minutesMap.put(20,"twenty minutes");
        minutesMap.put(21,"twenty one minutes");
        minutesMap.put(22,"twenty two minutes");
        minutesMap.put(23,"twenty three minutes");
        minutesMap.put(24,"twenty four minutes");
        minutesMap.put(25,"twenty five minutes");
        minutesMap.put(26,"twenty six minutes");
        minutesMap.put(27,"twenty seven minutes");
        minutesMap.put(28,"twenty eight minutes");
        minutesMap.put(29,"twenty nine minutes");
        minutesMap.put(30,"half");

        hoursMap.put(1,"one");
        hoursMap.put(2,"two");
        hoursMap.put(3,"three");
        hoursMap.put(4,"four");
        hoursMap.put(5,"five");
        hoursMap.put(6,"six");
        hoursMap.put(7,"seven");
        hoursMap.put(8,"eight");
        hoursMap.put(9,"nine");
        hoursMap.put(10,"ten");
        hoursMap.put(11,"eleven");
        hoursMap.put(12,"twelve");
    }

    public static void main(String[] args) {
        timeInWords(12, 47);
        timeInWords(5, 15);
        timeInWords(7, 24);
    }

    public static String timeInWords(int h, int m) {
        boolean isPast = true;
        if (m > 30) {
            m = 60 - m;
            isPast = false;
        }
        if (m == 0) {
            return hoursMap.get(h) + " " + minutesMap.get(m);
        }
        StringBuilder builder = new StringBuilder();
        builder.append(minutesMap.get(m));
        if (isPast) {
            builder.append(" past ").append(hoursMap.get(h));
        } else {
            builder.append(" to ").append(hoursMap.get(h + 1 > 12 ? 1 : h + 1));
        }

        return builder.toString();
    }
}
