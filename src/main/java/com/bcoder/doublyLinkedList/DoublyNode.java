package com.bcoder.doublyLinkedList;

public class DoublyNode< T > {

  private T data;
  private DoublyNode < T > nextNode;
  private DoublyNode < T > previousNode;
  private int index;

  public DoublyNode (T data) {
    this.data = data;
  }

  public T getData ( ) {
    return data;
  }

  public void setData ( T data ) {
    this.data = data;
  }

  public DoublyNode < T > getNextNode ( ) {
    return nextNode;
  }

  public void setNextNode ( DoublyNode < T > nextNode ) {
    this.nextNode = nextNode;
  }

  public DoublyNode < T > getPreviousNode ( ) {
    return previousNode;
  }

  public void setPreviousNode ( DoublyNode < T > previousNode ) {
    this.previousNode = previousNode;
  }

  public int getIndex ( ) {
    return index;
  }

  public void setIndex ( int index ) {
    this.index = index;
  }

  @Override
  public String toString ( ) {
    return "DoublyNode{" +
            "data=" + data +
            '}';
  }
}
