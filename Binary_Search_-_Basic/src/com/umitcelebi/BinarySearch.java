package com.umitcelebi;

import java.util.Arrays;
import java.util.List;

public class BinarySearch {

    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(1,2,3,4,5,6,7,8,12,14,15,17,18,19,20,22,24,26,27,29,30,33,35,36,38);
        System.out.println(getElementIndex(list, 17));
        System.out.println(getElementIndex(list, 19));
        System.out.println(getElementIndex(list, 9));
        System.out.println(getElementIndex(list, 27));
        System.out.println(getElementIndex(list, 7));
    }

    public static int getElementIndex(List<Integer> list, int number) {
        int first = 0;
        int last=list.size()-1;
        int mid = (first + last)/2;

        while( first <= last ){
            if ( list.get(mid) == number ){
                return mid;
            }else if ( list.get(mid) < number ){
                first = mid + 1;
            }else{
                last = mid - 1;
            }
            mid = (first + last)/2;
        }
        return -1;
    }
}
