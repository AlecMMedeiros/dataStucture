package com.bcoder.linkedList;

public class Main {

  public static void main ( String[] args ) {
    LinkedList<String> myLinkedList = new LinkedList<>();

    myLinkedList.add("Hello world 1");
    myLinkedList.add("Hello world 2");
    myLinkedList.add("Hello world 3");
    myLinkedList.add("Hello world 4");

    System.out.println (myLinkedList.get ( 0 ) );
    System.out.println (myLinkedList.get ( 1 ) );
    System.out.println (myLinkedList.get ( 2 ) );
    System.out.println (myLinkedList.get ( 3 ) );

    System.out.println(myLinkedList.remove ( 2 ));
    System.out.println(myLinkedList.remove ( 0));

    System.out.println(myLinkedList);


  }
}
