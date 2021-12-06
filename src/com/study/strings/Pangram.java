package com.study.strings;

public class Pangram {

    public static boolean checkIfPangram(String sentence) {

        if(sentence.length()<26){
            return false;
        }


        for(int i = 'a'; i < 'z'; i++)
            if(!sentence.contains(String.valueOf(i)))
            {
               return false;
            }
        return true;
    }


    public static void main(String[] args) {
        System.out.println(checkIfPangram("leetcode"));
    }
}
