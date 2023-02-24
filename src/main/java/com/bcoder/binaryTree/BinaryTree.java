package com.bcoder.binaryTree;

public class BinaryTree<T extends Comparable<T>> {

  private BinaryNode<T> root;

  // Constructor to create an empty binary tree
  public BinaryTree () {
    this.root = null;
  }

  // Method to insert a node into the binary tree
  public void insert ( T data ) {
    // Create a new node with the given data
    BinaryNode<T> newNode = new BinaryNode<>(data);
    // Call the private insert method with the root node and the new node
    root = insert(root, newNode);
  }

  // Private helper method to insert a node into the binary tree recursively
  private BinaryNode<T> insert ( BinaryNode<T> current, BinaryNode<T> newNode ) {
    // If the current node is null, we have reached the correct spot to insert the new node
    if (current == null) {
      return newNode;
    } else if (newNode.getData().compareTo(current.getData()) < 0) {
      // If the new node's data is less than the current node's data, insert it into the left subtree
      current.setLeftNode(insert(current.getLeftNode(), newNode));
    } else {
      // Otherwise, insert it into the right subtree
      current.setRightNode(insert(current.getRightNode(), newNode));
    }
    return current;
  }

  // Method to display the binary tree in order
  public void displayInOrder () {
    System.out.println("\n Displaying in Order");
    this.displayInOrder(this.root);
  }

  // Private helper method to display the binary tree in order recursively
  private void displayInOrder ( BinaryNode<T> current ) {
    if (current != null) {
      // Display the left subtree
      this.displayInOrder(current.getLeftNode());
      // Display the current node's data
      System.out.print(current.getData() + ", ");
      // Display the right subtree
      displayInOrder(current.getRightNode());
    }
  }

  // Method to display the binary tree in post order
  public void displayPostOrder () {
    System.out.println("\n Displaying Post Order");
    this.displayPostOrder(this.root);
  }

  // Private helper method to display the binary tree in post order recursively
  private void displayPostOrder ( BinaryNode<T> current ) {
    if (current != null) {
      // Display the left subtree
      displayPostOrder(current.getLeftNode());
      // Display the right subtree
      displayPostOrder(current.getRightNode());
      // Display the current node's data
      System.out.print(current.getData() + ", ");
    }
  }

  // Method to display the binary tree in pre order
  public void displayPreOrder () {
    System.out.println("\n Displaying Pre Order");
    this.displayPreOrder(this.root);
  }

  // Private helper method to display the binary tree in pre order recursively
  private void displayPreOrder ( BinaryNode<T> current ) {
    if (current != null) {
      // Display the current node's data
      System.out.print(current.getData() + ", ");
      // Display the left subtree
      this.displayPreOrder(current.getLeftNode());
      // Display the right subtree
      this.displayPreOrder(current.getRightNode());
    }
  }
  public void remover(T data) {
    try {
      // Call the private remover method to remove the data from the tree
      root = remover(root, data);
    } catch (NullPointerException e) {
      // If the data is not found in the tree, catch the NullPointerException and print an error message
      System.out.println("Data not found. Catch block");
    }
  }

  private BinaryNode<T> remover(BinaryNode<T> node, T data) {
    // If the node is null, return null
    if (node == null) {
      return null;
    }

    // If the data is less than the node's data, recursively call remover on the left subtree
    if (data.compareTo(node.getData()) < 0) {
      node.setLeftNode(remover(node.getLeftNode(), data));
    }
    // If the data is greater than the node's data, recursively call remover on the right subtree
    else if (data.compareTo(node.getData()) > 0) {
      node.setRightNode(remover(node.getRightNode(), data));
    }
    // If the data is equal to the node's data
    else {
      // If the node has no children, set it to null
      if (node.getLeftNode() == null && node.getRightNode() == null) {
        node = null;
      }
      // If the node has no left child, replace it with its right child
      else if (node.getLeftNode() == null) {
        node = node.getRightNode();
      }
      // If the node has no right child, replace it with its left child
      else if (node.getRightNode() == null) {
        node = node.getLeftNode();
      }
      // If the node has two children
      else {
        // Find the minimum node in the right subtree
        BinaryNode<T> temp = findMinimum(node.getRightNode());
        // Set the node's data to the minimum node's data
        node.setData(temp.getData());
        // Recursively call remover on the right subtree to remove the minimum node
        node.setRightNode(remover(node.getRightNode(), temp.getData()));
      }
    }

    // Return the modified node
    return node;
  }

  private BinaryNode<T> findMinimum(BinaryNode<T> node) {
    // If the node has no left child, it is the minimum node
    if (node.getLeftNode() == null) {
      return node;
    }
    // Otherwise, recursively call findMinimum on the left subtree
    return findMinimum(node.getLeftNode());
  }

}


