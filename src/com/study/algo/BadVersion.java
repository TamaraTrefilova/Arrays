package com.study.algo;

public class BadVersion {
 private  boolean isBadVersion(int version){
     return false;
 }

    public int firstBadVersion(int n) {
        int start = 1;
        int end = n;
        int mid = 0;

        while(start<end){
            mid = start + (end - start )/2;
            if(isBadVersion(mid)){
                end = mid;

            } else{
                start = mid+1;
            }

        }

        return start;
    }

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


        System.out.println((31-22)/2);
    }


}
