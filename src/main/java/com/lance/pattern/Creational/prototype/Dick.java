package com.lance.pattern.Creational.prototype;

/**
 * Created by lihua on 26/4/2017.
 * email: lihua@qq.com
 */
class Dick implements Person {
  private final String NAME = "Dick";

  @Override
  public Person clone() {
    return new Dick();
  }

  @Override
  public String toString() {
    return NAME;
  }
}
