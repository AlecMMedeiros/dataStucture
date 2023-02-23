package com.bcoder.stack;

public class Stack<T> {
  private Node<T> refEntryNode;

  public Stack() {
    this.refEntryNode = null;
  }

  public void push(T data) {
    // Create a new node with the specified data
    Node<T> newNode = new Node<>(data);
    // Save the current reference to the top of the stack in a temporary variable
    Node<T> refAuxiliary = this.refEntryNode;
    // Set the new node as the new top of the stack
    this.refEntryNode = newNode;
    // Set the reference of the new node to the previous top of the stack
    newNode.setRefNo(refAuxiliary);
  }

  public T pop() {
    if (!this.isEmpty()) {
      // Get a reference to the node at the top of the stack
      Node<T> nodePoped = this.refEntryNode;
      // Set the next node in the stack as the new top of the stack
      this.refEntryNode = refEntryNode.getRefNode();
      // Return the data stored in the node that was removed from the top of the stack
      return (T) nodePoped;
    }
    // If the stack is empty, return null
    return null;
  }

  public T top() {
    // Return the data stored in the node at the top of the stack
    return this.refEntryNode.getData();
  }

  public boolean isEmpty() {
    // Return true if the top of the stack is null (i.e., the stack is empty)
    return this.refEntryNode == null;
    // Otherwise, return false
  }

  @Override
  public String toString() {
    // Declare and initialize a string called stringReturn
    String stringReturn = "--------------\n";
    stringReturn += "    Stack\n";
    stringReturn += "--------------\n";

    Node < T > nodeAuxiliary = refEntryNode;

    // Loop through the stack and append each node's data to stringReturn
    while (true) {
      if (nodeAuxiliary != null) {
        stringReturn += "[" + nodeAuxiliary.getData() + "]\n";
        nodeAuxiliary = nodeAuxiliary.getRefNode();
      } else {
        break;
      }
    }
    // Add a separator to stringReturn and return the final string
    stringReturn += "==============\n";
    return stringReturn;
  }
}
