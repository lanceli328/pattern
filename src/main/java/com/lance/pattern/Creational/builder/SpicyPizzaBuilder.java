package com.lance.pattern.Creational.builder;

/**
 * Created by lihua on 26/4/2017.
 * email: lihua@qq.com
 */
public class SpicyPizzaBuilder extends PizzaBuilder {
  public void buildDough() {
    pizza.setDough("pan baked");
  }

  public void buildSauce() {
    pizza.setSauce("hot");
  }

  public void buildTopping() {
    pizza.setTopping("pepperoni+salami");
  }
}