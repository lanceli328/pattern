package com.lance.pattern.Behavioral.command;

/**
 * Created by lihua on 3/4/2017.
 * email: lihua@qq.com
 */
public interface Receiver {

  /**
   * Receiver get the command object and execute it
   * @param object
   */
  void action(Object object);

  /**
   * Rollback previous action
   * @param object
   */
  void rollback();
}
