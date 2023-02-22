package com.bcoder.stack;

public class Node {
  private int data;
  private Node refNode = null;

  public Node () {

  }

  public Node ( int data ) {
    this.data = data;
  }

  public int getData ( ) {
    return data;
  }

  public void setData ( int data ) {
    this.data = data;
  }

  public Node getRefNode ( ) {
    return refNode;
  }

  public void setRefNo ( Node reNode ) {
    this.refNode = reNode;
  }

  @Override
  public String toString ( ) {
    return "No{" +
            "data = " + data +
            '}';
  }
}
