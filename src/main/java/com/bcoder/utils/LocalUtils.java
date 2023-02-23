package com.bcoder.utils;

public class LocalUtils {
  public static void validateIndex(int index, int size) throws IndexOutOfBoundsException {
    if (size == 0 && index > size) {
      throw new IndexOutOfBoundsException("Index out of bounds: " + index);
    }
    if (index < 0 || index > size) {
      throw new IndexOutOfBoundsException("Index out of bounds: " + index);
    }
  }
}
