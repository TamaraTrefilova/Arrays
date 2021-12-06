package com.study.strings;

public class FinalValue {


    public static int finalValueAfterOperations(String[] operations) {

//        int rez = 0;
//        for (int i = 0; i<operations.length; i++){
//            String ch = operations[i];
//             if(ch.charAt(ch.length()-1)=='-'|| ch.charAt(0)=='-'){
//                 rez--;
//             }
//            if(ch.charAt(ch.length()-1)=='+'|| ch.charAt(0)=='+'){
//                rez++;
//            }
//        }
//        return rez;

        int rez = 0;
        for (int i = 0; i<operations.length; i++) {
            String ch = operations[i];
            switch (ch.charAt(1)) {
                case '-':
                    rez--;
                    break;
                case '+':
                    rez++;
                    break;
                default:
                    break;
            }
        }
        return rez;
    }

    public static void main(String[] args) {

        System.out.print(finalValueAfterOperations(new String[]{"++X","++X","X++"}));

    }

}
