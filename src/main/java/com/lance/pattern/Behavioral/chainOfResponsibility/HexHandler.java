package com.lance.pattern.Behavioral.chainOfResponsibility;

/**
 * Created by lihua on 24/4/2017.
 * email: lihua@qq.com
 */
public class HexHandler extends Handler {

  public HexHandler(int _level) {
    super(_level);
  }

  @Override
  protected void response(String message) {
    System.out.println("I am HEX handler, and I get message: " + message);
  }
}
