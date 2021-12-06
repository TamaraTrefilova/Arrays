package com.study.strings;

import java.util.HashMap;
import java.util.Map;

public class SelectionSort {


    public static void swap(int[] arr, int i, int z) {
        if (i == z) {
            return;
        }
        int temp = arr[i];
        arr[i] = arr[z];
        arr[z] = temp;

    }

//    int[] intArray = new int[7];
//    intArray[0] = 20;
//    intArray[1] = 35;
//    intArray[2] = -15;
//    intArray[3] = 7;
//    intArray[4] = 55;
//    intArray[5] = 1;
//    intArray[6] = -22;

    public static int[] selectionSort(int[] arr) {
        int unsorted = arr.length-1;
        for(int i = 1; i<unsorted; unsorted --){
            int largest = 0;
            for(int z = i; z<= unsorted; z++){
                if(arr[largest]<arr[z]){
                    largest = z;
                }
            }
            swap(arr, largest, unsorted);
        }

        return arr;
    }


    public static void main(String[] args) {

        // write your code here
//        System.out.println("Hello world!");
        int[] intArray = new int[7];
        intArray[0] = 20;
        intArray[1] = 35;
        intArray[2] = -15;
        intArray[3] = 7;
        intArray[4] = 55;
        intArray[5] = 1;
        intArray[6] = -22;

        for (int i = 0; i < intArray.length; i++) {
            System.out.print(intArray[i] + ", ");
        }
        System.out.println();

        intArray = selectionSort(intArray);

        for (int i = 0; i < intArray.length; i++) {
            System.out.print(intArray[i] + ", ");
        }

    }


}
