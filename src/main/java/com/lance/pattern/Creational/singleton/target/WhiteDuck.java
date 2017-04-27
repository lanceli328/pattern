package com.lance.pattern.Creational.singleton.target;

/**
 * Created by lihua on 30/3/2017.
 * email: lihua@seczone.cn
 */
public class WhiteDuck implements Duck {

  @Override
  public void run() {
    System.out.println("I run fast!");
  }

  @Override
  public void printColor() {
    System.out.println("I am a white duck.");
  }
}
