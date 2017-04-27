package com.lance.pattern.Creational.prototype;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by lihua on 26/4/2017.
 * email: lihua@seczone.cn
 */
class Factory {
  private static final Map<String, Person> prototypes = new HashMap<>();

  static {
    prototypes.put("tom", new Tom());
    prototypes.put("dick", new Dick());
    prototypes.put("harry", new Harry());
  }

  public static Person getPrototype(String type) {
    try {
      return prototypes.get(type).clone();
    } catch (NullPointerException ex) {
      System.out.println("Prototype with name: " + type + ", doesn't exist");
      return null;
    }
  }
}
