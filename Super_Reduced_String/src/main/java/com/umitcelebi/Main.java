package main.java.com.umitcelebi;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        System.out.println(superReducedString("baab"));
    }

    public static String superReducedString(String s) {
        List<String> stringList = new ArrayList<>();
        for (int i = 0; i < s.length(); i++) {
            stringList.add(s.substring(i,i+1));
        }

        List<String> list = getResultList(stringList);
        if (list.size() > 0) {
            return String.join("", list);
        }

        return "Empty String";
    }


    public static List<String> getResultList(List<String> characterList) {

        if (characterList.size() > 1) {
            for (int i = 1; i < characterList.size(); i++) {
                if (characterList.get(i).equals(characterList.get(i-1))) {
                    characterList.remove(i);
                    characterList.remove(i-1);
                    getResultList(characterList);
                }
            }
        } else {
            return characterList;
        }
        return characterList;
    }
}
