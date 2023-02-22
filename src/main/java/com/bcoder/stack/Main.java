package com.bcoder.stack;

public class Main {

  public static void main ( String[] args) {

    Stack<String> myStack = new Stack <> ( );


    myStack.push ( "First" );
    myStack.push ( "Second" );
    myStack.push ( "Third" );
    myStack.push ( "Forth" );

    System.out.println (myStack );

    myStack.pop ();

    System.out.println (myStack );

    myStack.push ("Almost Last");

    System.out.println (myStack );

    // myStack.pop();
    System.out.println (myStack );

    myStack.push ("Last");

    System.out.println (myStack );
    System.out.println (myStack.top () );

  }


}
