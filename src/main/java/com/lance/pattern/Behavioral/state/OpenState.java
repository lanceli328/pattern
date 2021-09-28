package com.lance.pattern.Behavioral.state;

/**
 * Created by lihua on 25/4/2017.
 * email: lihua@qq.com
 */
public class OpenState extends LiftState{

  @Override
  public boolean open() {
    return context.getLift().open();
  }

  @Override
  public boolean close() {
    return context.getLift().close();
  }

  @Override
  public boolean run() {
    // not allow, nothing to do
    return false;
  }

  @Override
  public boolean stop() {
    // has already stop, nothing to do
    return false;
  }
}
