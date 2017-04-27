package com.lance.pattern.Creational.prototype;

import org.junit.Test;

/**
 * Created by lihua on 26/4/2017.
 * email: lihua@seczone.cn
 */
public class Tests {

  @Test
  public void test() {
    String[] args = {"tom", "dick", "harry"};
    if (args.length > 0) {
      for (String type : args) {
        Person prototype = Factory.getPrototype(type);
        if (prototype != null) {
          System.out.println(prototype);
        }
      }
    } else {
      System.out.println("Run again with arguments of command string ");
    }
  }

}
