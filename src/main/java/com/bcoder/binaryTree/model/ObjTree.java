package com.bcoder.binaryTree.model;

public abstract class ObjTree<T> implements Comparable<T>  {

  public abstract boolean equals(Object other);
  public abstract int hashCode();
  public abstract int compareTo(T other);
  public abstract String toString();

}