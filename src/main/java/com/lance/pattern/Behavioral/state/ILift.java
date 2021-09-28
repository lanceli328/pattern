package com.lance.pattern.Behavioral.state;

/**
 * Created by lihua on 25/4/2017.
 * email: lihua@qq.com
 */
public interface ILift {
  boolean open();
  boolean close();
  boolean run();
  boolean stop();
}
