package com.lance.pattern.Behavioral.state;

/**
 * Created by lihua on 25/4/2017.
 * email: lihua@qq.com
 */
public class RunState extends LiftState{

  @Override
  public boolean open() {
    //not allowed, nothing to do;
    return false;
  }

  @Override
  public boolean close() {
    //has already closed, nothing to do;
    return false;
  }

  @Override
  public boolean run() {
    //I am already running, nothing to do
    return false;
  }

  @Override
  public boolean stop() {
    return context.getLift().stop();
  }
}
