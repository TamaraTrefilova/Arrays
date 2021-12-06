package com.study.strings;

import java.util.*;

public class Consistent {


    public static int countConsistentStrings(String allowed, String[] words) {

        int counter = 0;
        int arr[] = new int[26];
        char toChars[] = allowed.toCharArray();
        for (char c : toChars)
            arr[c-'a']++;

        for (String w : words)
        {
            for(int i = 0; i < w.length(); i++)
                if(arr[w.charAt(i)-'a'] == 0)
                {
                    counter--;
                    break;
                }
            counter++;
        }
        return counter;

    }

    public static void main(String[] args) {
        String [] words = {"ad","bd","aaab","baa","badab"};
        System.out.println(countConsistentStrings("ab",  words));


    }
}
