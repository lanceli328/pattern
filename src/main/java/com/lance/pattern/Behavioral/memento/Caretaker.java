package com.lance.pattern.Behavioral.memento;

import java.util.ArrayList;

/**
 * Created by lihua on 25/4/2017.
 * email: lihua@seczone.cn
 */
public class Caretaker {
  private ArrayList<Memento> mementos = new ArrayList<>();

  public void addMemento(Memento m) {
    mementos.add(m);
  }

  public Memento getMemento() {
    return mementos.get(1);
  }
}
