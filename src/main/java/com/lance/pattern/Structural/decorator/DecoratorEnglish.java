package com.lance.pattern.Structural.decorator;

/**
 * Created by lihua on 3/4/2017.
 * email: lihua@qq.com
 */
public class DecoratorEnglish extends Decorator {

  Component component;

  public void setComponent(Component component){
    this.component = component;
  }

  @Override
  public void sayHello(){
    this.sayHelloWithEnglish();
    super.sayHello();
    this.sayGoodBye();
  }

  private void sayHelloWithEnglish(){
    System.out.println("I am English version:");
  }

  private void sayGoodBye(){
    System.out.println("Good Bye!");
  }

}
