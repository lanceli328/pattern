package com.lance.pattern.Creational.builder;

/**
 * Created by lihua on 26/4/2017.
 * email: lihua@qq.com
 */
public class Waiter {
  private PizzaBuilder pizzaBuilder;

  public void setPizzaBuilder(PizzaBuilder pb) {
    pizzaBuilder = pb;
  }

  public Pizza getPizza() {
    return pizzaBuilder.getPizza();
  }

  public void constructPizza() {
    pizzaBuilder.createNewPizzaProduct();
    pizzaBuilder.buildDough();
    pizzaBuilder.buildSauce();
    pizzaBuilder.buildTopping();
  }
}