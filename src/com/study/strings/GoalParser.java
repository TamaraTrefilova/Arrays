package com.study.strings;

public class GoalParser {


    public static String interpret(String command) {

        StringBuilder s = new StringBuilder();
        for(int i= 0; i< command.length(); i++){
            if(command.charAt(i)=='('){
                if(command.charAt(i+1)== 'a'){
                    s.append("al");
                    i+=3;
                } else {
                    s.append('o');
                     i+=1;
                }
            } else{
                s.append('G');
            }
        }
        return s.toString();

//        return command.replace("()", "o").replace("(al)", "al");
    }

    public static void main(String[] args) {

        System.out.println(interpret( "(al)G(al)()()G") );


    }
}
