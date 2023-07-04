package com.umitcelebi;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        alternate("beabeefeab");
        alternate("asdcbsdcagfsdbgdfanfghbsfdab");
        alternate("asvkugfiugsalddlasguifgukvsa");
    }
    public static int alternate(String s) {

        List<List<Character>> list = getCharacterCombinations(s);
        int max = 0;

        bb:
        for (List<Character> characterList : list) {
            StringBuilder builder = new StringBuilder();
            boolean isFirst = true;

            for (int j = 0; j < s.length(); j++) {
                if (isFirst && characterList.contains(s.charAt(j)) ||
                        (!isFirst && (builder.charAt(builder.length() - 1) != s.charAt(j)) && characterList.contains(s.charAt(j)))) {
                    builder.append(s.charAt(j));
                    isFirst = false;
                } else if ((!isFirst && builder.charAt(builder.length() - 1) == s.charAt(j)) && characterList.contains(s.charAt(j))) {
                    continue bb;
                }
            }
            max = Math.max(builder.length(), max);
        }

        return max;
    }

    public static List<List<Character>> getCharacterCombinations(String s) {
        List<List<Character>> list = new ArrayList<>();
        List<Character> charList = getDistinctChars(s, new ArrayList<>(),0);

        for(int i = 0; i < charList.size() -1; i++) {
            for(int j = i + 1; j < charList.size(); j++) {
                list.add(Arrays.asList(charList.get(i), charList.get(j)));
            }
        }

        return list;
    }

    public static List<Character> getDistinctChars(String s, List<Character> list, int i) {
        if(i >= s.length()) return list;
        if(list.contains(s.charAt(i))) {
            i++;
            return getDistinctChars(s,list,i);
        }
        list.add(s.charAt(i));
        i++;
        return getDistinctChars(s,list,i);
    }
}
