package com.study.strings;

public class JewelsAndStone {

//    public static int numJewelsInStones(String jewels, String stones) {
//        int rez = 0;
//        for (int i = 0; i < jewels.length(); i++) {
//            for (int z = 0; z < stones.length(); z++) {
//                if (jewels.charAt(i) == stones.charAt(z)) {
//                    rez++;
//                }
//            }
//        }
//
//        return rez;
//    }


    public static int numJewelsInStones(String a, String b) {
        int [] c = new int[130];
        for(char i : b.toCharArray())
        {
            c[i]++;
        }
        int ans =0;
        for(char i : a.toCharArray())
        {
            ans+= c[i];
        }
        return ans;
    }



    public static void main(String[] args) {

        System.out.println(numJewelsInStones("cCeR","CCCcr"));


    }
}
