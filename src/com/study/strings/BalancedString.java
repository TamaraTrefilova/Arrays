package com.study.strings;

public class BalancedString {

    public static int balancedStringSplit(String s) {
        int total = 0;
        int r = 0;
        int l = 0;
        for(char ch: s.toCharArray()){
            switch(ch){
                case 'R':
                    r++;
                    break;
                case 'L':
                    l++;
                    break;
                    default:

            }
            if(r==l){
                total++;
                r=l=0;
            }
        }

        return total;
    }



    public static void main(String[] args) {


        System.out.println(balancedStringSplit("RLLLLRRRLR"));



    }
}
