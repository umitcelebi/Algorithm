package com.umitcelebi;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        bigSorting(Arrays.asList("1", "2", "100", "12303479849857341718340192371", "3084193741082937", "3084193741082938", "111", "200"));
        bigSorting(Arrays.asList("31415926535897932384626433832795" ,"1", "3", "10", "3", "5"));
    }

    static List<String> bigSorting(List<String> unsorted) {
        unsorted.sort(Main::StringAsIntegerCompare);
        return unsorted;
    }

    static int StringAsIntegerCompare(String s1, String s2)
    {
        if(s1.length() > s2.length()) return 1;
        if(s1.length() < s2.length()) return -1;
        for(int i = 0; i < s1.length(); i++)
        {
            if((int)s1.charAt(i) > (int)s2.charAt(i)) return 1;
            if((int)s1.charAt(i) < (int)s2.charAt(i)) return -1;
        }
        return 0;
    }
}
