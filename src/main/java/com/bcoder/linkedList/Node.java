package com.bcoder.linkedList;

public class Node<T> {

  // Data stored in the node
  private T data;

  // Reference to the next node in the list
  private Node<T> nextNode;

  // Constructor without parameters
  public Node () {
    // Set the reference to the next node to null
    this.nextNode = null;
  }

  // Constructor with a parameter for data
  public Node ( T data ) {
    // Set the reference to the next node to null
    this.nextNode = null;
    // Set the data stored in the node to the provided value
    this.data = data;
  }

  // Constructor with parameters for data and nextNode
  public Node ( T data, Node<T> nextNode ) {
    // Set the data stored in the node to the provided value
    this.data = data;
    // Set the reference to the next node to the provided node
    this.nextNode = nextNode;
  }

  // Getter for the data stored in the node
  public T getData () {
    return data;
  }

  // Setter for the data stored in the node
  public void setData ( T data ) {
    this.data = data;
  }

  // Getter for the reference to the next node
  public Node<T> getNextNode () {
    return nextNode;
  }

  // Setter for the reference to the next node
  public void setNextNode ( Node<T> nextNode ) {
    this.nextNode = nextNode;
  }

  // Override the toString() method to print the data stored in the node
  @Override
  public String toString () {
    return "[" + data.toString() + "]";
  }

}

