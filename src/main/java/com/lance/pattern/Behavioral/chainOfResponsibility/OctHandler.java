package com.lance.pattern.Behavioral.chainOfResponsibility;


/**
 * Created by lihua on 24/4/2017.
 * email: test@test.com
 */
public class OctHandler extends Handler {

  public OctHandler(int _level) {
    super(_level);
  }

  @Override
  protected void response(String message) {
    System.out.println("I am OCT handler, and I get message: " + message);
  }
}
