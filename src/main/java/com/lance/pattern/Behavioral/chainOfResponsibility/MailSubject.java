package com.lance.pattern.Behavioral.chainOfResponsibility;

/**
 * Created by lihua on 24/4/2017.
 * email: test@test.com
 */
public class MailSubject implements Subject{

  private int type = 0;
  private String message;

  public MailSubject(int type,String message){
    this.type = type;
    this.message = message;
  }

  @Override
  public int getType() {
    return this.type;
  }

  @Override
  public String getRequest() {
    return this.message;
  }
}
