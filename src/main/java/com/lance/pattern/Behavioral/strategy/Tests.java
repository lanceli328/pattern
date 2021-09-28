package com.lance.pattern.Behavioral.strategy;

import org.junit.Test;

/**
 * Created by lihua on 26/4/2017.
 * email: lihua@qq.com
 */
public class Tests {

  /**
   *
   *
   */
  @Test
  public void test() {
    Context context = new Context();
    Strategy[] algorithms = {new FooSolution(), new BarSearch()};
    for (Strategy algorithm : algorithms) {
      context.setStrategy(algorithm);
      context.execute();
    }
  }
}
