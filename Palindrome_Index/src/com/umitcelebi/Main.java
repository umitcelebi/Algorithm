package com.umitcelebi;

public class Main {
    public static void main(String[] args) {
        palindromeIndex("hgygsvlfwcwnswtuhmyaljkqlqjjqlqkjlaymhutwsnwcflvsgygh");
        palindromeIndex("fgnfnidynhxebxxxfmxixhsruldhsaobhlcggchboashdlurshxixmfxxxbexhnydinfngf");
        palindromeIndex("aaab");
        palindromeIndex("broifqivnnvifiorb");
    }

    public static int palindromeIndex(String s) {
        int first = 0;
        int last = 0;
        boolean isPalindrom = true;
        boolean isFirstInequality = true;
        for(int i = 0; i < s.length() / 2; i++) {
            if(isFirstInequality && s.charAt(i) != s.charAt(s.length() - 1 - i)) {
                isPalindrom = false;
                first = i;
                last = s.length() - 1 - i;
                isFirstInequality = false;
                i--;
            }else if(!isFirstInequality && s.charAt(i) != s.charAt(s.length() - 2 - i)) {
                return first;
            }
        }
        if(isPalindrom) return -1;
        return last;
    }
}
