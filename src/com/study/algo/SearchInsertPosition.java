package com.study.algo;

public class SearchInsertPosition {


    public static int search (int [] arr, int target){
        int start = 0;
        int end = arr.length-1;
        int mid;

        while (start <= end){
            mid = (start+end)/2;
            if(arr[mid]==target){
                return mid;
            }
            if(arr[mid]>target){
                end = mid-1;

            } else {
                start = mid +1;
            }
        }
        return start;
    }




    public static void main(String[] args) {

//                int[] intArray =  { -1,0,3,5,9,12 };

//        int[] intArray = new int[7];
//        intArray[0] = 1;
//        intArray[1] = 2;
//        intArray[2] = 3;
//        intArray[3] = 4;
//        intArray[4] = 5;
//        intArray[5] = 6;
//        intArray[6] = 7;

        int[] intArray = new int[5];
        intArray[0] = 1;
        intArray[1] = 2;
        intArray[2] = 3;
        intArray[3] = 4;
        intArray[4] = 5;
//        intArray[5] = 6;
//        intArray[6] = 7;


        System.out.println(search(intArray, 7));
    }


}
