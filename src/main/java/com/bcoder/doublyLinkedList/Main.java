package com.bcoder.doublyLinkedList;

public class Main {

  public static void main ( String[] args ) {

    DoublyLinkedList<String> myList = new DoublyLinkedList<>();

    myList.add ( 0, "test1" );
    myList.add ( 1, "test2" );
    myList.add ( 2, "test3" );
    myList.add ( 2, "test3" );

    System.out.println(myList.size ());

    System.out.println(myList);

    System.out.println(myList.get ( 2 ));

    myList.remove ( 2 );

    System.out.println(myList);
    System.out.println(myList.size ());
  }
}
