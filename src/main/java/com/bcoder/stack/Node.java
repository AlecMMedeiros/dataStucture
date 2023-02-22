package com.bcoder.stack;

public class Node< T > {
  private T data;            // Declare an instance variable called data of type T
  private Node < T > refNode;  // Declare an instance variable called refNode of type Node<T> and initialize it to null

  public Node ( T data ) {    // Constructor that takes a parameter of type T
    this.data = data;      // Assign the value of data parameter to the data instance variable
  }

  public T getData ( ) {     // A method that returns the value of data instance variable
    return data;
  }

  public void setData ( T data ) {  // A method that takes a parameter of type T and assigns it to the data instance variable
    this.data = data;
  }


  public Node<T> getRefNode ( ) {    // A method that returns the value of refNode instance variable
    return refNode;
  }

  public void setRefNo ( Node<T> refNode ) {   // A method that takes a parameter of type Node and assigns it to the refNode instance variable
    this.refNode = refNode;
  }

  @Override
  public String toString ( ) {   // Override the toString method of Object class
    return "Node{" +
            "data = " + data +    // Add the value of data instance variable to the string
            '}';
  }
}
