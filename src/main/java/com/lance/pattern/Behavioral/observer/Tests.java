package com.lance.pattern.Behavioral.observer;

import org.junit.Test;

/**
 * Created by lihua on 24/4/2017.
 * email: lihua@seczone.cn
 */
public class Tests {

  @Test
  public void test(){
    IObserver hexObserver = new HexObserver();
    IObserver octObserver = new OctObserver();

    Subject subject = new Subject();
    subject.addObserver(hexObserver);
    subject.addObserver(octObserver);

    subject.setState(25);
  }
}
