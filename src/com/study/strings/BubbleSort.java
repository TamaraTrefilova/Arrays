package com.study.strings;

public class BubbleSort {

    public static void main(String[] args) {
        int[] intArray = new int[7];
        intArray[0] = 20;
        intArray[1] = 35;
        intArray[2] = -15;
        intArray[3] = 7;
        intArray[4] = 55;
        intArray[5] = 1;
        intArray[6] = -22;

        for (int i = 0 ; i<intArray.length; i++){
            System.out.print(intArray[i] +", ");
        }
        System.out.println();

        for ( int lastUnsorted = intArray.length-1; lastUnsorted > 0; lastUnsorted--){

            for (int i = 0; i < lastUnsorted; i++){
                if (intArray[i] > intArray[i+1]) {
                    swap(intArray, i, i+1);
                }
            }
        }

        for (int i = 0 ; i<intArray.length; i++){
            System.out.print(intArray[i] +", ");
        }
        System.out.println();
    }


    public static void swap(int[] intArray, int i, int j){
        if(i==j){
            return;
        }
        int temp = intArray[i];
        intArray [i] = intArray[j];
        intArray[j] = temp;
    }

}
