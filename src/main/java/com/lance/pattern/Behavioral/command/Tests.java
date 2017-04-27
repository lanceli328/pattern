package com.lance.pattern.Behavioral.command;

import org.junit.Test;

/**
 * Created by lihua on 3/4/2017.
 * email: lihua@seczone.cn
 */
public class Tests {

  @Test
  public void test(){

    Invoker invoker = new Invoker();

    Command command = new ContreteCommandA();
    invoker.setCommand(command);
    invoker.runCommand("test");
    invoker.undo();

    command = new ContreteCommandB();
    invoker.setCommand(command);
    invoker.runCommand("test");
    invoker.undo();
  }
}
