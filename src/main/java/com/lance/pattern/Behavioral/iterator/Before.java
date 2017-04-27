package com.lance.pattern.Behavioral.iterator;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import org.junit.Test;

/**
 * Created by lihua on 26/4/2017.
 * email: lihua@seczone.cn
 */
public class Before {

  class IntegerBox {

    private final List<Integer> list = new ArrayList<>();

    public void add(int in) {
      list.add(in);
    }

    public List getData() {
      return list;
    }
  }

  @Test
  public void test() {
    IntegerBox box = new IntegerBox();
    for (int i = 9; i > 0; --i) {
      box.add(i);
    }
    Collection integerList = box.getData();
    for (Object anIntegerList : integerList) {
      System.out.print(anIntegerList + "  ");
    }
    System.out.println();
    integerList.clear();
    integerList = box.getData();
    System.out.println("size of data is: " + integerList.size());
  }

}
