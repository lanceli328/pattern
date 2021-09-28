package com.lance.pattern.Behavioral.visitor;

/**
 * Created by lihua on 25/4/2017.
 * email: lihua@qq.com
 */
public class CommonEmployee extends Employee {

  private String job;

  public String getJob() {
    return job;
  }

  public void setJob(String job) {
    this.job = job;
  }

  @Override
  public void accept(IVisitor visitor) {
    visitor.visit(this);
  }
}
