package com.study.strings;

public class UpperCaseToLowerCase {

    public static String toLowerCase(String s) {
        StringBuilder result = new StringBuilder();
        for(char ch: s.toCharArray()){
//            if(ch >64 && ch < 91){
//                int a = ch+32;
//                result.append((char)a);
//            } else {
//                result.append(ch);
//            }
            if(ch >= 'A' && ch <= 'Z'){
                ch = (char)(ch - 'A' + 'a');
            }
            result.append(ch);
        }

        return result.toString();
    }





    public static void main(String[] args) {

        System.out.println(toLowerCase("Hello@[]"));


    }
}
