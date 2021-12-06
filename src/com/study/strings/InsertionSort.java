package com.study.strings;

public class InsertionSort
{

    public static int[] insertionSort( int [] intArray){

        for(int unsortedPart = 1; unsortedPart < intArray.length; unsortedPart++ ){
            int minValue = intArray[unsortedPart];
            int idx;
            for(idx = unsortedPart; idx> 0 && minValue<intArray[idx-1]; idx --  ){
                intArray[idx] = intArray[idx-1];
            }
            intArray[idx] = minValue;
        }

        return intArray;
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

        intArray = insertionSort(intArray);

        for (int i = 0; i < intArray.length; i++) {
            System.out.print(intArray[i] + ", ");
        }

    }
}
