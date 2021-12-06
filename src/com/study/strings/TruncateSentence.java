package com.study.strings;

import java.util.StringJoiner;

public class TruncateSentence {



    public static String truncateSentence(String s, int k) {
        int n=s.length();
        int c= 0;
        int i;
        for( i=0;i<n;i++){

            if(s.charAt(i)==' '){
                c++;
            }
            if(c==k){

                break;
            }
        }
        return s.substring(0,i);

//        String [] arr = s.split(" ");
//
//        String str = "";
//        for(int i = 0; i < k; i++){
//           str += arr[i]+" ";
//        }
//            return str;
    }


    public static void main(String[] args) {
        System.out.println(truncateSentence("What is the solution to this problem", 4));
    }
}
