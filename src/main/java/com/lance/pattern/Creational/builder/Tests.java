package com.lance.pattern.Creational.builder;

import org.junit.Test;

/**
 * Created by lihua on 26/4/2017.
 * email: lihua@qq.com
 */
public class Tests {

  @Test
  public void test() {
    Waiter waiter = new Waiter();
    PizzaBuilder hawaiianPizzabuilder = new HawaiianPizzaBuilder();
    PizzaBuilder spicyPizzaBuilder = new SpicyPizzaBuilder();

    waiter.setPizzaBuilder(hawaiianPizzabuilder);
    waiter.constructPizza();
    Pizza pizza = waiter.getPizza();
    pizza.printInfo();

    waiter.setPizzaBuilder(spicyPizzaBuilder);
    waiter.constructPizza();
    pizza = waiter.getPizza();
    pizza.printInfo();
  }
}
