package com.lance.pattern.Creational.singleton.target;

/**
 * Created by lihua on 30/3/2017.
 * email: lihua@seczone.cn
 */
public class YellowDuck implements Duck {

  @Override
  public void run() {
    System.out.println("I am a yellow duck, I run fastest!");
  }

  @Override
  public void printColor() {
    System.out.println("I am a yellow duck.");
  }
}
