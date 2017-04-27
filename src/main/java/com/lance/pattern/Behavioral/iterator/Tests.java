package com.lance.pattern.Behavioral.iterator;

import org.junit.Test;

/**
 * Created by lihua on 26/4/2017.
 * email: lihua@seczone.cn
 */
public class Tests {

  @Test
  public void test() {
    IntegerBox integerBox = new IntegerBox();
    for (int i = 9; i > 0; --i) {
      integerBox.add(i);
    }
    // getData() has been removed.
    // Client has to use MyIterator.
    MyIterator firstItr = integerBox.getIterator();
    MyIterator secondItr = integerBox.getIterator();
    for (firstItr.first(); !firstItr.isDone(); firstItr.next()) {
      System.out.print(firstItr.currentValue() + "  ");
    }
    System.out.println();
    // Two simultaneous iterations
    for (firstItr.first(), secondItr.first(); !firstItr.isDone();
        firstItr.next(), secondItr.next()) {
      System.out.print(firstItr.currentValue() + " " + secondItr.currentValue() + "  ");
    }
  }

}
