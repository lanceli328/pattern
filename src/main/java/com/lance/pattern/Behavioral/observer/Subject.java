package com.lance.pattern.Behavioral.observer;

import java.util.Observable;

/**
 * Created by lihua on 24/4/2017.
 * email: lihua@seczone.cn
 */
public class Subject extends Observable{

  private int state;

  public int getState() {
    return state;
  }

  public void setState(int value) {
    this.state = value;
    this.setChanged();
    this.notifyObservers(this.getState());
  }

}
