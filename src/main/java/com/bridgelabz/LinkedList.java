package com.bridgelabz;

public class LinkedList<K> implements INode<K>{

    private LinkedList<K> next;
    private K  key;


    //Constructor Declaration
    public LinkedList(K key){
        this.key = key;
        this.next = null;
    }

@Override
    public K getKey() {
        return key;
    }

@Override
    public void setKey(K key){
        this.key = key;
    }

@Override
    public LinkedList getNext() {
    return next;
}

    @Override
    public void setNext(INode next) {
        this.next = (LinkedList<K>) next;
    }

}
