package com.lance.pattern.Structural.decorator;

/**
 * Created by lihua on 3/4/2017.
 * email: lihua@qq.com
 */
public class ContreteComponent implements Component{

  @Override
  public void sayHello() {
    System.out.println("Hello!");
  }
}
