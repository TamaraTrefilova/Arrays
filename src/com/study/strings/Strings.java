package com.study.strings;

public class Strings {


    public static boolean isPalindrom(String first){

        for(int i = 0, j = first.length()-1; i<j; i++, j--){
            if(first.charAt(i)!=first.charAt(j)){
                return false;
            }
        }
        return true;
    }

    public static int convertFromStringToInt(String first){
            int rezult = 0;

        return rezult;
    }


    public static String convertFromIntToString(int number){
      StringBuilder s = new StringBuilder();
      boolean negative = false;
       if(number<0){
           number*=-1;
           negative = true;
       }
        do {
            int rez = number%10;
            s.append(rez);
            number = number/10;
        } while (number>0);

        if(negative){
            s.append('-');
        }
        s = s.reverse();

        return s.toString();
    }



    public static void main(String[] args) {

//        System.out.println(50%10);
//        System.out.println(5/10);
//        String s = "12345";
//        int i = s.charAt(1) -'0';
//
//        System.out.println(isPalindrom("racecar"));
        System.out.println(convertFromIntToString(-154213246));



    }
}
