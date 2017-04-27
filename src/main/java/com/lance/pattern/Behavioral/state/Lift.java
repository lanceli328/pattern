package com.lance.pattern.Behavioral.state;

/**
 * Created by lihua on 25/4/2017.
 * email: lihua@seczone.cn
 */
public class Lift implements ILift {

  @Override
  public boolean open() {
    System.out.println("Open the door!");
    return true;
  }

  @Override
  public boolean close() {
    System.out.println("Close the door!");
    return true;
  }

  @Override
  public boolean run() {
    System.out.println("Let us go!");
    return true;
  }

  @Override
  public boolean stop() {
    System.out.println("Stop!!!");
    return true;
  }
}
