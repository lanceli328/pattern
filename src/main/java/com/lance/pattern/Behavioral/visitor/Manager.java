package com.lance.pattern.Behavioral.visitor;

/**
 * Created by lihua on 25/4/2017.
 * email: lihua@qq.com
 */
public class Manager extends Employee {

  private String performance;

  public String getPerformance() {
    return performance;
  }

  public void setPerformance(String performance) {
    this.performance = performance;
  }

  @Override
  public void accept(IVisitor visitor) {
    visitor.visit(this);
  }
}
