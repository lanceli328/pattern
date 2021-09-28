package com.lance.pattern.Creational.prototype;

/**
 * Created by lihua on 26/4/2017.
 * email: lihua@qq.com
 */
class Harry implements Person {
  private final String NAME = "Harry";

  @Override
  public Person clone() {
    return new Harry();
  }

  @Override
  public String toString() {
    return NAME;
  }
}
