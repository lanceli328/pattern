package com.lance.pattern.Behavioral.state;

/**
 * Created by lihua on 25/4/2017.
 * email: lihua@qq.com
 */
public class CloseState extends LiftState{

  @Override
  public boolean open() {
    return context.getLift().open();
  }

  @Override
  public boolean close() {
    // has already closed, nothing to do;
    return false;
  }

  @Override
  public boolean run() {
    return context.getLift().run();
  }

  @Override
  public boolean stop() {
    return context.getLift().stop();
  }
}
