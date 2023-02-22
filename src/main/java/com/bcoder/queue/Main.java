package com.bcoder.queue;

public class Main {

  public static void main ( String[] args ) {

    Queue myQueue = new Queue ();

    myQueue.enqueue ( new Node ("First") );
    myQueue.enqueue ( new Node ("Second") );
    myQueue.enqueue ( new Node ("Third") );
    myQueue.enqueue ( new Node ("Forth") );
    myQueue.enqueue ( new Node ("Fifth") );
    myQueue.enqueue ( new Node ("Sixth") );

    System.out.println ( myQueue);

    System.out.println ( myQueue.dequeue ());

    System.out.println ( myQueue);

    myQueue.enqueue ( new Node ("Last") );

    System.out.println ( myQueue);

    System.out.println ( myQueue.first ());
    System.out.println ( myQueue);



  }
}
