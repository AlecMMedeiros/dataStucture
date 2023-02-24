package com.bcoder.circularList;

import com.bcoder.utils.LocalUtils;

public class CircularList< T > {
  private Node < T > head; // declare head of the list as a Node<T> object
  private Node < T > tail; // declare tail of the list as a Node<T> object
  private int listSize; // declare size of the list as an integer

  public CircularList ( ) { // constructor to initialize head, tail and list size
    this.head = null;
    this.tail = null;
    this.listSize = 0;
  }

  public void add ( T data ) { // method to add a new node to the list
    Node < T > newNode = new Node <> ( data ); // create a new node with the given data
    if (this.listSize == 0) { // if the list is empty, set the head and tail to the new node
      this.head = newNode;
      this.tail = this.head;
      this.head.setNextNode ( this.tail );
    } else { // if the list is not empty, set the new node as the next node of the tail, and update the head and tail accordingly
      newNode.setNextNode ( this.tail );
      this.head.setNextNode ( newNode );
      this.tail = newNode;
    }
    this.listSize++; // increment the list size
  }


  public void remove ( int index ) { // method to remove a node from the list given its index
    LocalUtils.validateIndex ( index , this.size ( ) ); // check if the index is valid

    Node < T > nodeAuxiliary = this.tail; // initialize a node auxiliary variable to the tail of the list
    if (index == 0) { // if the index is 0, set the tail to the next node of the current tail, and update the head accordingly
      this.tail = this.tail.getNextNode ( );
      this.head.setNextNode ( tail );
    } else if (index == 1) { // if the index is 1, set the next node of the tail to the next node of the next node of the tail
      this.tail.setNextNode ( this.tail.getNextNode ( ).getNextNode ( ) );
    } else { // if the index is greater than 1, iterate through the list until the node before the node to be removed, and set its next node to the next node of the node to be removed
      for ( int i = 0; i < index - 1; i++ ) {
        nodeAuxiliary = nodeAuxiliary.getNextNode ( );
      }
      nodeAuxiliary.setNextNode ( nodeAuxiliary.getNextNode ( ).getNextNode ( ) );
    }
    this.listSize--; // decrement the list size
  }

  public T get ( int index ) { // method to get the data of a node given its index
    return getNode ( index ).getData ( ); // return the data of the node returned by the getNode method
  }

  private Node < T > getNode ( int index ) { // private method to get a node given its index
    if(isEmpty())
      throw new IndexOutOfBoundsException("Empty List"); // check if the list is empty or not

    if (index == 0) { // if the index is 0, return the tail
      return this.tail;
    }

    Node < T > nodeAuxiliary = this.tail; // initialize a node auxiliary variable to the tail of the list
    for ( int i = 0; ( i < index ) && ( nodeAuxiliary != null ); i++ ) { // iterate through the list until the node with the given index, and return it
      nodeAuxiliary = nodeAuxiliary.getNextNode ( );
    }
    return nodeAuxiliary;
  }


  public boolean isEmpty ( ) {
    return listSize == 0;
  }

  public int size ( ) {
    return this.listSize;
  }


  @Override
  public String toString ( ) {
    StringBuilder strRetorno = new StringBuilder ( );
    Node < T > nodeAuxiliary = this.tail;
    if (this.size ( ) != 0) {
      for ( int i = 0; i < size ( ); i++ ) {
        strRetorno.append ( "[" ).append ( nodeAuxiliary.getData ( ) ).append ( "]" );
        nodeAuxiliary = nodeAuxiliary.getNextNode ( );
      }
    } else {
      strRetorno.append ( "[]" );
    }
    return strRetorno.toString ( );
  }
}
