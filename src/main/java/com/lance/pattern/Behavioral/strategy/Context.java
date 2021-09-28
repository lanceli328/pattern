package com.lance.pattern.Behavioral.strategy;

/**
 * Created by lihua on 26/4/2017.
 * email: lihua@qq.com
 */
public class Context {

  private Strategy strategy;

  public void setStrategy(Strategy strategy){
    this.strategy = strategy;
  }

  void execute(){
    System.out.println("Strategy start ...");
    this.strategy.solve();
    System.out.println("Strategy end");
  }
}
