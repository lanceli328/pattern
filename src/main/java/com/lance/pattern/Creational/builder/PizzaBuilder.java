package com.lance.pattern.Creational.builder;

/**
 * Created by lihua on 26/4/2017.
 * email: lihua@seczone.cn
 */ /* "Abstract Builder" */
abstract class PizzaBuilder {

  protected Pizza pizza;

  public Pizza getPizza() {
    return pizza;
  }

  public void createNewPizzaProduct() {
    pizza = new Pizza();
  }

  public abstract void buildDough();

  public abstract void buildSauce();

  public abstract void buildTopping();
}
