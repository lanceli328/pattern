package com.lance.pattern.Behavioral.strategy;

/**
 * Created by lihua on 26/4/2017.
 * email: lihua@qq.com
 */
class FooSolution extends StrategySolution {
  private int state = 1;

  protected void start() {
    System.out.print("Start  ");
  }

  protected void stop() {
    System.out.println("Stop");
  }

  protected boolean nextTry() {
    System.out.print("NextTry-" + state++ + "  ");
    return true;
  }

  protected boolean isSolution() {
    System.out.print("IsSolution-" + (state == 3) + "  ");
    return (state == 3);
  }
}
