package com.study.arrays;

public class Array {

    private int [] items;
    private int count = 0;

    public Array (int length){
        items = new int[length];
    }

    public void  insert ( int item){

        if(items.length==count){
            int [] newItems = new int[count*2];
            for(int i = 0; i<count; i++){
                newItems[i]=items[i];
            }
            items = newItems;
        }
        items[count++] = item;

    }

    public void  remove ( int idx){

        if(idx<0 || idx>=count) {
            throw new IllegalArgumentException();
        }
        for(int i = idx; i<count;i++){
            items[i] = items[i+1];
        }
        count--;
    }


    public int  indexOf ( int item){

        for(int i = 0; i<count; i++){
            if(items[i]==item){
                return i;
            }

        }
        return -1;
    }

    public void print(){
        for(int i = 0; i< count; i++){
            System.out.println(items[i]);
        }
    }
}
