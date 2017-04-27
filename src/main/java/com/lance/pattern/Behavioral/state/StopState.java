package com.lance.pattern.Behavioral.state;

/**
 * Created by lihua on 25/4/2017.
 * email: lihua@seczone.cn
 */
public class StopState extends LiftState{

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
    return context.getLift().run();
  }

  @Override
  public boolean stop() {
    // has already stop, nothing to do
    return false;
  }
}
