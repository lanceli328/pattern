package com.lance.pattern.Behavioral.command;

/**
 * Created by lihua on 3/4/2017.
 * email: lihua@seczone.cn
 */
public class ReceiverB implements Receiver{

  private Object object = "default";
  private Object previousObject;

  @Override
  public void action(Object object) {
    this.previousObject = this.object;
    this.object = object;
    System.out.println("Receiver B: "+this.object.toString());
  }

  @Override
  public void rollback() {
    this.object = this.previousObject;
    System.out.println("Receiver B rollback to : "+this.object.toString());
  }
}
