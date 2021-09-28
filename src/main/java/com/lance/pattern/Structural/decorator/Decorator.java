package com.lance.pattern.Structural.decorator;

/**
 * Created by lihua on 3/4/2017.
 * email: lihua@qq.com
 */
public abstract class Decorator extends ContreteComponent {

  Component component;

  public void setComponent(Component component){
    this.component = component;
  }

  @Override
  public void sayHello(){
    super.sayHello();
  }

}
