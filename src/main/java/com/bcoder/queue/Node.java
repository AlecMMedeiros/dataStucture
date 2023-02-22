package com.bcoder.queue;

public class Node<T> {
  private T object;          // declare a generic object
  private Node<T> refEntryNode;   // declare a reference to another Node

  public Node(T object) {    // constructor with a parameter of generic type T
    this.object = object;   // initialize object to the parameter passed
    this.refEntryNode = null;  // initialize refEntryNode to null
  }

  public Object getObject() {   // getter method for object
    return object;           // return object
  }

  public void setObject(T object) {   // setter method for object
    this.object = object;         // set object to the parameter passed
  }

  public Node<T> getRefNode() {   // getter method for refEntryNode
    return refEntryNode;    // return refEntryNode
  }

  public void setRefNode(Node<T> refNode) {  // setter method for refEntryNode
    this.refEntryNode = refNode;        // set refEntryNode to the parameter passed
  }

  @Override
  public String toString() {    // override the toString method
    return "Node{" +
            "object=" + object +
            '}';             // return a string representation of the Node object
  }
}

