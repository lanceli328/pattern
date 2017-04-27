package com.lance.pattern.Behavioral.command;

/**
 * Created by lihua on 3/4/2017.
 * email: lihua@seczone.cn
 */
public class Invoker {
  private Command command;

  public void setCommand(Command command){
    this.command = command;
  }

  public void runCommand(Object object){
    System.out.println("We can add some common action or log in here ...");
    this.command.execute(object);
  }

  public void undo(){
    this.command.undo();
  }
}
