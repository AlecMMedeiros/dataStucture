package com.bcoder.linkedList;

public class LinkedList<T> {

  private Node<T> refEntryNode;

  public LinkedList ( ) {
    this.refEntryNode = null;
  }

  public void validateIndex(int index) {
    if (index >= this.size()) throw new IndexOutOfBoundsException("Index out of range");
  }

  public Node<T> get(int index){
    this.validateIndex(index);
    Node<T> nodeAuxiliary = this.refEntryNode;
    Node<T> genericNode = null;
    int countLeap = 0;
    while (countLeap <= index) {
      genericNode = nodeAuxiliary;
      nodeAuxiliary = nodeAuxiliary.getNextNode();
      countLeap++;
    }
    return genericNode;
  }

  public void add(T data){
    Node<T> newNode = new Node<>(data);
    if(this.isEmpty()) {
      this.refEntryNode = newNode;
      return;
    }
    Node<T> nodeAuxiliary = this.refEntryNode;
    for (int i = 0; i < this.size() - 1; i++) {
      nodeAuxiliary = nodeAuxiliary.getNextNode();
    }
    nodeAuxiliary.setNextNode(newNode);
  }

  public T remove(int index){
    Node<T> pivotNode = this.get(index);
    if (index == 0) {
      this.refEntryNode = pivotNode.getNextNode();
      return pivotNode.getData();
    }
    Node<T> previousNode = this.get(index -1);
    previousNode.setNextNode(pivotNode.getNextNode());
    return pivotNode.getData();
  }

  public boolean isEmpty(){
    if(this.refEntryNode == null) return true;
    return false;
  }

  public int size(){
    int size = 0;
    Node <T> refAuxiliary = this.refEntryNode;
    do {
      if (refAuxiliary == null) break;
        refAuxiliary = refAuxiliary.getNextNode();
        size++;
      } while (refAuxiliary != null);
    return size;
  }

  @Override
  public String toString() {

    String stringReturn = "--------------\n";
    stringReturn += "    Linked List\n";
    stringReturn += "--------------\n";

    Node<T> nodeToStringAuxiliary = refEntryNode;

    if (nodeToStringAuxiliary != null) {
      while (true) {
        if (nodeToStringAuxiliary.getNextNode() != null) {
          stringReturn += "[" + nodeToStringAuxiliary.getData() + "], ";
          nodeToStringAuxiliary = nodeToStringAuxiliary.getNextNode();
        }
        else {
          stringReturn += "[" + nodeToStringAuxiliary.getData() + "]";
          break;
        }
      }
    }
    else {
      stringReturn = "null";
    }
    return stringReturn;
  }
}
