package com.bcoder.queue;

public class Main {

  public static void main ( String[] args ) {

    Queue<String> myQueue = new Queue<> ();

    myQueue.enqueue ( "First" );
    myQueue.enqueue ( "Second" );
    myQueue.enqueue ( "Third" );
    myQueue.enqueue ( "Forth" );
    myQueue.enqueue ( "Fifth" );
    myQueue.enqueue ( "Sixth" );

    System.out.println ( myQueue);

    System.out.println ( myQueue.dequeue ());

    System.out.println ( myQueue);

    myQueue.enqueue ( "Last" );

    System.out.println ( myQueue);

    System.out.println ( myQueue.first ());
    System.out.println ( myQueue);



  }
}
