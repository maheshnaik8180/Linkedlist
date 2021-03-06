package com.bridgelabz;

import org.junit.Assert;
import org.junit.Test;

public class LinkedListTest {
    public LinkedListTest() {
    }

    //Method to get three numbers when one node is linked with other key
    @Test
    public void given3NumbersWhenLinkedShouldPassLinkedListTest() {
        LinkedList<Integer> myFirstNode = new LinkedList<>(56);
        LinkedList<Integer> mySecondNode = new LinkedList<>(30);
        LinkedList<Integer> myThirdNode = new LinkedList<>(70);
        myFirstNode.setNext(mySecondNode);
        mySecondNode.setNext(myThirdNode);
        boolean result = myFirstNode.getNext().equals(mySecondNode) && mySecondNode.getNext().equals(myThirdNode);
        Assert.assertTrue(result);

    }

    // Given 3 numbers when added to linked list should be added to top
    @Test
    public void given3NumbersWhenAddedToLinkedListShouldBeAddedToTop() {
        LinkedList<Integer> myFirstNode = new LinkedList<>(70);
        LinkedList<Integer> mySecondNode = new LinkedList<>(30);
        LinkedList<Integer> myThirdNode = new LinkedList<>(56);
        MyLinkedList myLinkedList = new MyLinkedList();
        myLinkedList.add(myFirstNode);
        myLinkedList.add(mySecondNode);
        myLinkedList.add(myThirdNode);
        myLinkedList.printMyNode();
        boolean result = myLinkedList.head.equals(myThirdNode) && myLinkedList.head.getNext().equals(mySecondNode)
                && myLinkedList.tail.equals(myFirstNode);
        Assert.assertTrue(result);



    }

    // Given 3 numbers when appended should be Added to last

    @Test
    public void given3NumbersWhenAppendedShouldBeAddedToLast() {
        LinkedList<Integer> myFirstNode = new LinkedList<>(56);
        LinkedList<Integer> mySecondNode = new LinkedList<>(30);
        LinkedList<Integer> myThirdNode = new LinkedList<>(70);
        MyLinkedList myLinkedList = new MyLinkedList();
        myLinkedList.add(myFirstNode);
        myLinkedList.append(mySecondNode);
        myLinkedList.append(myThirdNode);
        myLinkedList.printMyNode();
        boolean result = myLinkedList.head.equals(myFirstNode) && myLinkedList.head.getNext().equals(mySecondNode)
                && myLinkedList.tail.equals(myThirdNode);
        Assert.assertTrue(result);

    }

    //Given 3 numbers when inserting in between should pass linked list test
    @Test
    public void given3NumbersWhenInsertingBetweenShouldPassLinkedListTest() {
        LinkedList<Integer> myFirstNode = new LinkedList<>(56);
        LinkedList<Integer> mySecondNode = new LinkedList<>(30);
        LinkedList<Integer> myThirdNode = new LinkedList<>(70);
        MyLinkedList myLinkedList = new MyLinkedList();
        myLinkedList.add(myFirstNode);
        myLinkedList.append(myThirdNode);
        myLinkedList.insert(myFirstNode,mySecondNode);
        myLinkedList.printMyNode();
        boolean result = myLinkedList.head.equals(myFirstNode) && myLinkedList.head.getNext().equals(mySecondNode) && myLinkedList.tail.equals(myThirdNode);
        Assert.assertTrue(result);


    }

    @Test
    public void givenFirstNumberWhenDeletedShouldPassLinkedListTest() {
    LinkedList<Integer> myFirstNode = new LinkedList<>(56);
    LinkedList<Integer> mySecondNode = new LinkedList<>(30);
    LinkedList<Integer> myThirdNode = new LinkedList<>(70);
    MyLinkedList myLinkedList = new MyLinkedList();
    myLinkedList.add(myFirstNode);
    myLinkedList.append(mySecondNode);
    myLinkedList.append(myThirdNode);
    myLinkedList.pop();
    myLinkedList.printMyNode();
    boolean result = myLinkedList.head.equals(mySecondNode)
            && myLinkedList.tail.equals(myThirdNode);

        Assert.assertTrue(result);
    }

    @Test
    public void givenLastNumberWhenDletedShouldPassLinkedListTest() {
        LinkedList<Integer> myFirstNode = new LinkedList<>(56);
        LinkedList<Integer> mySecondNode = new LinkedList<>(30);
        LinkedList<Integer> myThirdNode = new LinkedList<>(70);
        MyLinkedList myLinkedList = new MyLinkedList();
        myLinkedList.append(myFirstNode);
        myLinkedList.append(mySecondNode);
        myLinkedList.append(myThirdNode);
        myLinkedList.popLast();
        myLinkedList.printMyNode();
        boolean result = myLinkedList.head.equals(myFirstNode) && myLinkedList.tail.equals(mySecondNode);
        Assert.assertTrue(result);
    }
}
