package com.bcoder.queue;

public class Node {
  private Object object;
  private Node refEntryNode;

  public Node ( Object object) {
    this.object = object;
    this.refEntryNode = null;
  }

  public Object getObject ( ) {
    return object;
  }

  public void setObject ( Object object ) {
    this.object = object;
  }

  public Node getRefNode ( ) {
    return refEntryNode;
  }

  public void setRefNode ( Node refNo ) {
    this.refEntryNode = refNo;
  }

  @Override
  public String toString ( ) {
    return "No{" +
            "object=" + object +
            '}';
  }
}
