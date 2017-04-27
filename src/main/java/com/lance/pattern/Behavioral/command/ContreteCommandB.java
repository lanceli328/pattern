package com.lance.pattern.Behavioral.command;

/**
 * Created by lihua on 3/4/2017.
 * email: lihua@seczone.cn
 */
public class ContreteCommandB implements Command {

  Receiver receiver = new ReceiverB();

  @Override
  public void execute(Object object) {
    receiver.action(object);
  }

  @Override
  public void undo() {
    receiver.rollback();
  }
}
