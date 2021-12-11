package com.study.arrays;

public class ArrayImplementation {




    public static void main(String[] args) {
        Array numbers = new Array(3);
        numbers.insert(1);
        numbers.insert(2);
        numbers.insert(3);
        numbers.print();
        System.out.println("---------");
        numbers.insert(4);
        numbers.print();
        System.out.println("index of " + 100 +" is " + numbers.indexOf(100));
        System.out.println("---------");
        numbers.remove(0);
        numbers.print();
    }

}
