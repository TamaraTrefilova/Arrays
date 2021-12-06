package com.study.strings;

public class NestingDepth {

    public static int maxDepth(String s) {
        int res = 0;
        int open = 0;
        for(char i : s.toCharArray()){
            switch (i) {
                case '(':
                    open++;
                    break;
                case ')':
                    open--;
                    break;
                default:
            }
            if(open > res){
                res = open;
            }
        }
        return res;
    }



    public static void main(String[] args) {

        System.out.println(maxDepth( "1"));
    }
}
