package com.lance.pattern.Creational.builder;

/**
 * Created by lihua on 26/4/2017.
 * email: lihua@seczone.cn
 */
public class HawaiianPizzaBuilder extends PizzaBuilder {

  public void buildDough() {
    pizza.setDough("cross");
  }

  public void buildSauce() {
    pizza.setSauce("mild");
  }

  public void buildTopping() {
    pizza.setTopping("ham+pineapple");
  }
}
