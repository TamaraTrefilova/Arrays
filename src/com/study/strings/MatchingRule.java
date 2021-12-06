package com.study.strings;

import java.util.List;

public class MatchingRule {


    public static int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {
        int idx = 0;
    int res=0;
        switch(ruleKey){
            case "type":
                idx=0;
                break;
            case"color":
                idx=1;
                break;
            case "name":
                idx=2;
                break;
            default:

        }
        for(int i =0; i<items.size();i++){
            if(items.get(i).get(idx).equals(ruleValue)){
                res++;
            }
        }


        return res;
    }



    public static void main(String[] args) {


    }

}
