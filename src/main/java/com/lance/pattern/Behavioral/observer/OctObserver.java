package com.lance.pattern.Behavioral.observer;

import java.util.Observable;

/**
 * Created by lihua on 24/4/2017.
 * email: lihua@seczone.cn
 */
public class OctObserver extends IObserver {
  @Override
  public void update(Observable o, Object arg) {
    Integer state = (Integer) arg;
    System.out.println(Integer.toOctalString(state));
  }
}
