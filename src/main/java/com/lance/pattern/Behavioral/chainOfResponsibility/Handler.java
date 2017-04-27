package com.lance.pattern.Behavioral.chainOfResponsibility;

/**
 * Created by lihua on 24/4/2017.
 * email: lihua@seczone.cn
 */
public abstract class Handler {

  private int level = 0;
  private Handler nextHandler;

  public Handler(int _level) {
    this.level = _level;
  }

  public void setNextHandler(Handler nextHandler){
    this.nextHandler = nextHandler;
  }

  public final void handle(Subject subject) {
    if (subject.getType() == this.level) {
      this.response(subject.getRequest());
    } else {
      if (this.nextHandler != null) {
        this.nextHandler.handle(subject);
      } else {
        System.out.println("-----------the end!---------"+subject.getType());
      }
    }
  }

  protected abstract void response(String message);
}