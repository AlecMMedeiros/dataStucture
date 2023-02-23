package com.bcoder.linkedList;

public class Main {

  public static void main ( String[] args ) {
    LinkedList<String> myLinkedList = new LinkedList<>();

    myLinkedList.add("Hello world");
    myLinkedList.add("My List");
    myLinkedList.add("Uhuuuu");
    System.out.println(myLinkedList);
    System.out.println(myLinkedList.get(1));
    myLinkedList.remove(2);

    System.out.println(myLinkedList);

  }
}
