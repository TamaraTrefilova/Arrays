package com.study.strings;

import java.sql.SQLOutput;

public class Conversion {


    public static String convertFromInt(int i){

        boolean negative = false;
        StringBuilder s = new StringBuilder();
        if(i<0){
            negative = true;
            i*=-1;
        }

        do{
            s.append((char)('0'+ i%10));
            i= i/10;
        }while(i!=0);

        if(negative){
            s.append("-");
        }

        s.reverse();
        return s.toString();

    }


    public static int convertFromString( String str){
        if(str.length()==0){
            return 0;
        }
       int result = 0;

        for( int i = str.charAt(0)=='-'?1:0; i<str.length(); i++){
            final int num = str.charAt(i) - '0';
            result  = result*10 + num;
        }

        return str.charAt(0)=='-'?-result:result;

    }

    public static void main(String[] args) {
//        StringBuilder s = new StringBuilder();
//        s.append((char)('0'+Math.abs(10/5)));
//        s.append((char)('0'+Math.abs(10/2)));
//        s.reverse();
//        System.out.println(s.toString());
//        System.out.println(convertFromInt(-354));
//        String s = "2";
//        System.out.println(s.charAt(0)-'0');
        System.out.println(convertFromString("-100001"));
    }
}
