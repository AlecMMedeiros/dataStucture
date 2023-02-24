package com.bcoder.circularList;

public class Main {

  public static void main ( String[] args ) {

    CircularList<String> myList = new CircularList<> ();

    System.out.println (myList);

    myList.add ( "Test1" );

    System.out.println (myList);

    myList.add ( "Test2" );
    myList.add ( "Test3" );

    System.out.println (myList.get ( 0 ));
    System.out.println (myList.get ( 1 ));
    System.out.println (myList.get ( 2 ));
    System.out.println (myList.get ( 3 ));
    System.out.println (myList.get ( 4 ));
    System.out.println (myList.get ( 5 ));

    System.out.println (myList);

    System.out.println (myList.isEmpty ());
    System.out.println (myList.size ());

    myList.remove ( 1 );

    System.out.println (myList);
    System.out.println (myList.size ());

  }
}
