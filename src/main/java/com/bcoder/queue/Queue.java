package com.bcoder.queue;

// Define a generic class called Queue that takes a type parameter T
public class Queue<T> {

  // Declare a private instance variable of type Node<T> called refEntryNode
  private Node<T> refEntryNode;

  // Define a constructor for the Queue class that initializes refEntryNode to null
  public Queue() {
    this.refEntryNode = null;
  }

  // Define a method called enqueue that takes a data parameter of type T and adds a new node with that data to the queue
  public void enqueue(T data) {
    // Create a new node with the given data
    Node<T> newNode = new Node<>(data);
    // Set the reference of the new node to the current refEntryNode
    newNode.setRefNode(this.refEntryNode);
    // Set the refEntryNode to the new node
    this.refEntryNode = newNode;
  }

  // Define a method called dequeue that removes and returns the first element in the queue
  public T dequeue() {
    // Check if the queue is not empty
    if (!this.isEmpty()) {
      // Declare a variable called firstNo and initialize it to the refEntryNode
      Node<T> firstNo = this.refEntryNode;
      // Declare a variable called auxliarNode and initialize it to the refEntryNode
      Node<T>auxliarNode = this.refEntryNode;
      // Loop until the last node in the queue is found
      while (true) {
        // If the current node has a next node, set auxliarNode to the current node and firstNo to the next node
        if (firstNo.getRefNode() != null) {
          auxliarNode = firstNo;
          firstNo = firstNo.getRefNode();
          // Otherwise, set the reference of the second-to-last node to null and break out of the loop
        } else {
          auxliarNode.setRefNode(null);
          break;
        }
      }
      // Return the data of the removed node
      return (T) firstNo.getObject();
    }
    // If the queue is empty, return null
    return null;
  }

  // Define a method called first that returns the first element in the queue without removing it
  public T first() {
    // Check if the queue is not empty
    if (!this.isEmpty()) {
      // Declare a variable called firstNo and initialize it to the refEntryNode
      Node<T> firstNo = this.refEntryNode;
      // Loop until the last node in the queue is found
      while (true) {
        // If the current node has a next node, set firstNo to the next node
        if (firstNo.getRefNode() != null) {
          firstNo = firstNo.getRefNode();
          // Otherwise, break out of the loop
        } else {
          break;
        }
      }
      // Return the data of the first node in the queue
      return (T) firstNo.getObject();
    }
    // If the queue is empty, return null
    return null;
  }

  // Define a method called isEmpty that returns true if the queue is empty and false otherwise
  public boolean isEmpty() {
    return this.refEntryNode == null;
  }

  // Override the toString method to print the contents of the queue
  @Override
  public String toString() {
    // Declare and initialize a string called stringReturn
    String stringReturn = "--------------\n";
    stringReturn += "    Queue\n";
    stringReturn += "--------------\n";

    // Set a reference to the first node in the queue
    Node<T> nodeAuxiliar = refEntryNode;

    // If the reference is not null, enter a loop that iterates over the nodes in the queue
    if (nodeAuxiliar != null) {
      while (true) {
        // If the current node has a next node, add the current node's data to stringReturn and set the reference to the next node
        if (nodeAuxiliar.getRefNode() != null) {
          stringReturn += "[" + nodeAuxiliar.getObject() + "], ";
          nodeAuxiliar = nodeAuxiliar.getRefNode();
        }
        // If the current node does not have a next node, add its data to stringReturn with no trailing comma and break out of the loop
        else {
          stringReturn += "[" + nodeAuxiliar.getObject() + "]";
          break;
        }
      }
    }
    // If the reference to the first node is null, set the string to "null"
    else {
      stringReturn = "null";
    }

    // Return the constructed string
    return stringReturn;
  }
}
