package com.study.strings;

public class Address {



    public static String defangIPaddr(String address) {
        StringBuilder builder = new StringBuilder();
        builder.append(address.charAt(0));
        for(int i = 1; i< address.length(); i++){
            if( address.charAt(i)=='.'){
                builder.append("[.]");
            } else{
                builder.append(address.charAt(i));
            }

        }

        return builder.toString();
    }




    public static void main(String[] args) {


        System.out.println("255.100.50.0");
        System.out.println(defangIPaddr("255.100.50.0"));



    }
}