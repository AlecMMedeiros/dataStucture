package com.bcoder.doublyLinkedList;


import com.bcoder.utils.LocalUtils;

public class DoublyLinkedList <T> {
  private DoublyNode<T> refEntryNode;  // reference to the first node in the list
  private DoublyNode<T> refExitNode;  // reference to the last node in the list
  private int listSize;               // current size of the list

  public DoublyLinkedList ( ) {
    this.listSize = 0;
  }

  public void add(T data) {
    // create a new node with the given data
    DoublyNode<T> newNode = new DoublyNode<T>(data);
    newNode.setNextNode(null);
    newNode.setPreviousNode(this.refExitNode);

    // if the list is empty, set the entry node to the new node
    if (this.refEntryNode == null) {
      this.refEntryNode = newNode;
    }

    // if the list is not empty, set the next node of the last node to the new node
    if (this.refExitNode != null) {
      this.refExitNode.setNextNode(newNode);
    }

    // set the exit node to the new node and increase the size of the list
    this.refExitNode = newNode;
    listSize++;
  }

  public void add(int index, T data) {
    // validate the index to make sure it is within bounds
    LocalUtils.validateIndex(index, this.size());

    // check if the index is already being used by a node in the list
    DoublyNode<T> current = this.refEntryNode;
    while (current != null) {
      if (current.getIndex() == index) {
        throw new IndexOutOfBoundsException("Index already in use: " + index);
      }
      current = current.getNextNode();
    }

    // get the node that currently occupies the given index
    DoublyNode<T> nodeAuxiliary = getNo(index);

    // create a new node with the given data and index
    DoublyNode<T> newNode = new DoublyNode<>(data);
    newNode.setIndex(index);
    newNode.setNextNode(nodeAuxiliary);

    // if the new node is not the last node in the list, set its previous node to the previous node of the node it is replacing
    if (newNode.getNextNode() != null) {
      newNode.setPreviousNode(nodeAuxiliary.getPreviousNode());
      newNode.getNextNode().setPreviousNode(newNode);
    } else {  // if the new node is the last node in the list, set the exit node to the new node
      newNode.setPreviousNode(this.refExitNode);
      this.refExitNode = newNode;
    }

    // if the new node is the first node in the list, set the entry node to the new node
    if (index == 0) {
      this.refEntryNode = newNode;
    } else {  // if the new node is not the first node in the list, set the next node of the previous node to the new node
      newNode.getPreviousNode().setNextNode(newNode);
    }

    // increase the size of the list
    listSize++;
  }

  public void remove(int index){
    LocalUtils.validateIndex ( index, listSize);
    if(index == 0){
      this.refEntryNode = this.refEntryNode.getNextNode();
      if(this.refEntryNode != null){
        this.refEntryNode.setPreviousNode (null);
      }
    }else{
      DoublyNode<T> nodeAuxiliary = getNo(index);
      nodeAuxiliary.getPreviousNode ().setNextNode (nodeAuxiliary.getNextNode ());
      if(nodeAuxiliary != this.refExitNode){
        nodeAuxiliary.getNextNode ().setPreviousNode (nodeAuxiliary.getPreviousNode ());
      }else{
        this.refExitNode = nodeAuxiliary;
      }
    }
    listSize--;
  }

  public T get(int index){
    LocalUtils.validateIndex ( index, this.size () );
    return getNo(index).getData ();
  }

  private DoublyNode<T> getNo(int index){
    DoublyNode<T> nodeAuxiliary = this.refEntryNode;
    // Traverse the list until the desired index or the end is reached
    for(int i = 0; (i < index) && (nodeAuxiliary != null); i++){
      nodeAuxiliary = nodeAuxiliary.getNextNode ();
    }
    return nodeAuxiliary;
  }


  public int size(){
    return listSize;
  }

  @Override
  public String toString() {
    String strRetorno = "";
    DoublyNode<T> nodeAuxiliary = this.refEntryNode;
    // Traverse the list and concatenate the data of each node to a string
    for(int i = 0; i < size(); i++){
      strRetorno += "[" + nodeAuxiliary.getData () +"]";
      nodeAuxiliary = nodeAuxiliary.getNextNode ();
    }
    return strRetorno;
  }
}
