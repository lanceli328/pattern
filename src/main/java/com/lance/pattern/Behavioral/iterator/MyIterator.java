package com.lance.pattern.Behavioral.iterator;

import java.util.NoSuchElementException;

/**
 * Created by lihua on 26/4/2017.
 * email: lihua@seczone.cn
 */
public class MyIterator {

  private IntegerBox box;
  private java.util.Iterator iterator;
  private int value;

  public MyIterator(IntegerBox integerBox) {
    box = integerBox;
  }

  public void first() {
    iterator = box.getList().iterator();
    next();
  }

  public void next() {
    try {
      value = (Integer) iterator.next();
    } catch (NoSuchElementException ex) {
      value = -1;
    }
  }

  public boolean isDone() {
    return value == -1;
  }

  public int currentValue() {
    return value;
  }
}
