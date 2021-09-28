package com.lance.pattern.Behavioral.command;

/**
 * Created by lihua on 3/4/2017.
 * email: lihua@qq.com
 */
public interface Command {

  /**
   * Declare the interface for command format
   * and pass the details to receiver action
   */
  void execute(Object object);

  /**
   * undo this command
   * @param object
   */
  void undo();
}
