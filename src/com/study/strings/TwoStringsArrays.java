package com.study.strings;

public class TwoStringsArrays {

    public static boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        StringBuilder builder1 = new StringBuilder();
        StringBuilder builder2 = new StringBuilder();
        for(String s: word1){
            builder1.append(s);
        }
        for(String s: word2){
            builder2.append(s);
        }

        String first = builder1.toString();
        String second = builder2.toString();
        if(first.length()!=second.length())
            return false;
        for(int i = 0; i<first.length(); i++){
            if(first.charAt(i)!=second.charAt(i))
                return false;
        }

        return true;
    }










    public static void main(String[] args) {

    }
}
