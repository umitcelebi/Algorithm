package com.umitcelebi;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        encryption("haveaniceday");
        encryption("feedthedog");
        encryption("chillout");
        encryption("ifmanwasmeanttostayonthegroundgodwouldhavegivenusroots");
    }
    public static String encryption(String s) {

        s = s.replaceAll("\\s","");
        int length = s.length();
        int row = (int) Math.floor(Math.sqrt(length));
        int column = (int) Math.ceil(Math.sqrt(length));
        if (row * column < length) {
            row = Math.max(row,column);
            column = row;
        }

        List<String> a = new ArrayList<>();
        for (int i = 0; i < s.length(); i+=column) {
            a.add(s.substring(i, Math.min(i + column, s.length())));
        }

        return appendWords(a,column,row);
    }

    public static String appendWords(List<String> a, int column, int row) {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < column; i++) {
            StringBuilder b = new StringBuilder();
            for (int j = 0; j < row; j++){
                if (i < a.get(j).length()) {
                    b.append(a.get(j).charAt(i));
                }
            }
            result.append(b).append(" ");
        }
        return result.toString();
    }
}
