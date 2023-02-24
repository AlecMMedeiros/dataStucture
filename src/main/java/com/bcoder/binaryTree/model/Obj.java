package com.bcoder.binaryTree.model;

import java.util.Objects;

public class Obj extends ObjTree<Obj> {

  // declare an integer variable called "myValue"
  Integer myValue;

  // constructor that sets "myValue" to the passed integer parameter
  public Obj(Integer myValue){
    this.myValue = myValue;
  }

  // method to compare two objects for equality
  @Override
  public boolean equals(Object toCompareObject) {
    // check if the two objects are the same reference
    if (this == toCompareObject) return true;
    // check if the passed object is null or is not of the same class
    if (toCompareObject == null || getClass() != toCompareObject.getClass()) return false;
    // cast the passed object to an "Obj" object
    Obj obj = (Obj) toCompareObject;
    // compare the "myValue" integer of the two objects for equality
    return Objects.equals(myValue, obj.myValue);
  }

  // method to generate a hash code for the object
  @Override
  public int hashCode() {
    // generate the hash code based on the "myValue" integer
    return Objects.hash(myValue);
  }

  // method to compare two "Obj" objects
  @Override
  public int compareTo(Obj toCompareObject) {
    // declare an integer variable "i" and initialize it to 0
    int i = 0;

    // check if the "myValue" integer of this object is greater than the passed object's "myValue" integer
    if(this.myValue > toCompareObject.myValue){
      i = 1; // set "i" to 1 if this object is greater
    }else if(this.myValue < toCompareObject.myValue){
      i = -1; // set "i" to -1 if this object is less
    }

    // return the value of "i", which represents the comparison result
    return i;
  }

  // method to generate a string representation of the object
  @Override
  public String toString() {
    // return the string representation of the "myValue" integer
    return myValue.toString();
  }
}