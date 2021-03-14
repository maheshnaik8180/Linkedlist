package com.bridgelabz;

public class LinkedList<K> {

    private LinkedList next;
    private K  key;


    //Constructor Declaration
    public LinkedList(K key){
        this.key = null;
        this.next = null;
    }

//to get key
    public K getKey() {
        return key;
    }

//set key
    public void setKey(K key){
        this.key = key;
    }

//to get Next
    public LinkedList getNext() {
    return next;
}

//To set Next
    public void setNext(LinkedList next) {
        this.next = next;
    }
}
