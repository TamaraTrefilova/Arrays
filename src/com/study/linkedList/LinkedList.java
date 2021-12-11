package com.study.linkedList;

public class LinkedList {

    private class Node {

        private int value;
        private Node next;

        public Node (int value){
            this.value = value;
        }
    }

    private Node first;
    private Node last;


    public void addFirst(int item){
        var node = new Node(item);
        if(first == null)
            first = last = node;
        else {
            last.next = node;
            last = node;
        }
    }


    public void addLast(Node node){

    }


    public void deletFirst(){

    }

    public void deletLast(){

    }

    public boolean isContains(Node node){
        return false;
    }

    public int indexOf(Node node){
        return -1;
    }


    public void print(){

    }

}
