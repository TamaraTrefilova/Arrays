package com.study.algo;

public class BinarySearch {

    public static int search(int[] nums, int target) {
        int start = 0;
        int end = nums.length-1;
        int  mid = 0 ;
        mid = getInteger(nums, target, start, end, mid );
        if (mid != -1) return mid;

        return -1;
    }

    private static int getInteger(int[] nums, int target, int start, int end , int mid ) {

        while(start <=end){
            mid = (start + end) /2;
            if(nums[mid]==target){
                return mid;
            }
            if(nums[mid] > target){
                end = mid -1;

                return  getInteger(nums, target, start, end, mid);
            }
            if(nums[mid] < target){
                start = mid +1 ;
                return getInteger(nums, target, start, end, mid);
            }
        }
        return -1;
    }




    public static  int search1(int[] nums, int target) {
        int start = 0;
        int end = nums.length-1;
        while(start <=end){
            int mid = (start + end) /2;
            if(nums[mid]==target){
                return mid;
            }
            if(nums[mid] > target){
                end = mid -1;

            }
            if(nums[mid] < target){
                start = mid +1 ;
            }
        }

        return -1;
    }
//    public void function

    public static void main(String[] args) {

//                int[] intArray =  { -1,0,3,5,9,12 };

        int[] intArray = new int[7];
        intArray[0] = 1;
        intArray[1] = 2;
        intArray[2] = 3;
        intArray[3] = 4;
        intArray[4] = 5;
        intArray[5] = 6;
        intArray[6] = 7;


        System.out.println(search(intArray, 5));
    }



}
