package com.lance.pattern.Behavioral.iterator;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by lihua on 26/4/2017.
 * email: lihua@seczone.cn
 */
class IntegerBox {

  private List<Integer> list = new ArrayList<>();

  public void add(int in) {
    list.add(in);
  }

  public List<Integer> getList(){
    return list;
  }

  public MyIterator getIterator() {
    return new MyIterator(this);
  }
}
