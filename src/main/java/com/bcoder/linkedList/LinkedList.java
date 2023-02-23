package com.bcoder.linkedList;

public class LinkedList< T > {

  private Node < T > refEntryNode;

  // Constructor initializes an empty LinkedList
  public LinkedList ( ) {
    this.refEntryNode = null;
  }

  // Throws an exception if the index is out of range
  public void validateIndex ( int index ) {
    if (index >= this.size ( )) throw new IndexOutOfBoundsException ( "Index out of range" );
  }

  // Returns the node at the given index
  public Node < T > get ( int index ) {
    // Validate the index first
    this.validateIndex ( index );
    // Start searching for the node from the entry node
    Node < T > nodeAuxiliary = this.refEntryNode;
    // Initialize a generic node as null
    Node < T > genericNode = null;
    // Traverse the linked list until the index is reached
    int countLeap = 0;
    while (countLeap <= index) {
      genericNode = nodeAuxiliary;
      nodeAuxiliary = nodeAuxiliary.getNextNode ( );
      countLeap++;
    }
    return genericNode;
  }

  // Add a new node with given data to the end of the linked list
  public void add ( T data ) {
    Node < T > newNode = new Node <> ( data );
    // If the linked list is empty, set the new node as the entry node
    if (this.isEmpty ( )) {
      this.refEntryNode = newNode;
      return;
    }
    // Traverse the linked list until the last node is reached
    Node < T > nodeAuxiliary = this.refEntryNode;
    for ( int i = 0; i < this.size ( ) - 1; i++ ) {
      nodeAuxiliary = nodeAuxiliary.getNextNode ( );
    }
    // Set the next node of the last node to the new node
    nodeAuxiliary.setNextNode ( newNode );
  }

  // Remove and return the node at the given index
  public T remove ( int index ) {
    // Get the node to remove
    Node < T > pivotNode = this.get ( index );
    // If the node to remove is the entry node, set the next node as the new entry node
    if (index == 0) {
      this.refEntryNode = pivotNode.getNextNode ( );
      return pivotNode.getData ( );
    }
    // Get the previous node of the node to remove
    Node < T > previousNode = this.get ( index - 1 );
    // Set the next node of the previous node to the next node of the node to remove
    previousNode.setNextNode ( pivotNode.getNextNode ( ) );
    // Return the data of the node to remove
    return pivotNode.getData ( );
  }

  // Check if the linked list is empty
  public boolean isEmpty ( ) {
    if (this.refEntryNode == null) return true;
    return false;
  }

  // Return the size of the linked list
  public int size ( ) {
    int size = 0;
    Node < T > refAuxiliary = this.refEntryNode;
    do {
      if (refAuxiliary == null) break;
      refAuxiliary = refAuxiliary.getNextNode ( );
      size++;
    } while (refAuxiliary != null);
    return size;
  }

  // Override the toString() method to return a string representation of the linked list
  @Override
  public String toString ( ) {

    String stringReturn = "--------------\n";
    stringReturn += "    Linked List\n";
    stringReturn += "--------------\n";

    Node < T > nodeToStringAuxiliary = refEntryNode;

    if (nodeToStringAuxiliary != null) {
      while (true) {
        if (nodeToStringAuxiliary.getNextNode ( ) != null) {
          stringReturn += "[" + nodeToStringAuxiliary.getData ( ) + "], ";
          nodeToStringAuxiliary = nodeToStringAuxiliary.getNextNode ( );
        } else {
          stringReturn += "[" + nodeToStringAuxiliary.getData ( ) + "]";
          break;
        }
      }
    } else {
      stringReturn = "null";
    }
    stringReturn += "\nSize: " + this.size ( );
    return stringReturn;
  }
}
