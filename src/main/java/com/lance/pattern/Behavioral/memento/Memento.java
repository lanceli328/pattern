package com.lance.pattern.Behavioral.memento;

/**
 * Created by lihua on 25/4/2017.
 * email: lihua@seczone.cn
 */
public class Memento {
  private String state;

  public Memento(String state) {
    this.state = state;
  }

  public String getState() {
    return state;
  }
}
