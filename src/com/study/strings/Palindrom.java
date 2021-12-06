package com.study.strings;

import java.util.Locale;

public class Palindrom {


    public static boolean isPalindrome(String s) {

        String str = s.replaceAll("[^a-zA-Z0-9]", "");
//        str = str.toLowerCase();
        int start = 0;
        int end = str.length()-1;
        while(start<=end){

            if(Character.toLowerCase(str.charAt(start))!=Character.toLowerCase(str.charAt(end))){
                return false;
            }
            start++;
            end--;
        }

        return true;
    }

    public static void main(String[] args) {
        String s = "A man, a plan, a canal: Panama";
        String str = s.replaceAll("[^a-zA-Z]", "");
        System.out.println();
        System.out.println(isPalindrome(s ));
    }
}
