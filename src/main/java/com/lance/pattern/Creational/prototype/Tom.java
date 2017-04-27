package com.lance.pattern.Creational.prototype;

/**
 * Created by lihua on 26/4/2017.
 * email: lihua@seczone.cn
 */
class Tom implements Person {
  private final String NAME = "Tom";

  @Override
  public Person clone() {
    return new Tom();
  }

  @Override
  public String toString() {
    return NAME;
  }
}