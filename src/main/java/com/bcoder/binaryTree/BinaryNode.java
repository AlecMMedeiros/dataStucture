package com.bcoder.binaryTree;

public class BinaryNode<T extends Comparable<T>> {

  private T data;
  private BinaryNode<T> leftNode;
  private BinaryNode<T> rightNode;

  public BinaryNode(T data) {
    this.data = data;
    leftNode = rightNode = null;
  }

  public BinaryNode() {
  }

  public T getData () {
    return data;
  }

  public void setData ( T data ) {
    this.data = data;
  }

  public BinaryNode<T> getLeftNode () {
    return leftNode;
  }

  public void setLeftNode ( BinaryNode<T> leftNode ) {
    this.leftNode = leftNode;
  }

  public BinaryNode<T> getRightNode () {
    return rightNode;
  }

  public void setRightNode ( BinaryNode<T> rightNode ) {
    this.rightNode = rightNode;
  }
}
