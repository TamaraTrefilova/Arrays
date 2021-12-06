package com.study.strings;

public class ShaffledString {


    public static String sortSentence(String s) {

        String [] stringArray = s.split(" ");
        String [] newArray  = new String [stringArray.length];
        for( int i = 0; i < stringArray.length ; i++ ){
            String word = stringArray[i];

            int index = Character.getNumericValue(word.charAt(word.length()-1));
            newArray[index -1] = word.substring(0,word.length()-1);
        }
        String str = String.join(" ", newArray);
        return   str;
    }
    public static void main(String[] args) {


        String s =   sortSentence("is2 sentence4 This1 a3");

        System.out.println(s);

    }

}
