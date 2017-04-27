package com.lance.pattern.Behavioral.command;

/**
 * Created by lihua on 3/4/2017.
 * email: lihua@seczone.cn
 */
public class ContreteCommandA implements Command{

  Receiver receiver = new ReceiverA();

  @Override
  public void undo() {
    receiver.rollback();
  }

  @Override
  public void execute(Object obj) {
    receiver.action(obj);
  }
}
