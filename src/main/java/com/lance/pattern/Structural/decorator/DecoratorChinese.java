package com.lance.pattern.Structural.decorator;

/**
 * Created by lihua on 3/4/2017.
 * email: lihua@seczone.cn
 */
public class DecoratorChinese extends Decorator {

  Component component;

  public void setComponent(Component component){
    this.component = component;
  }

  @Override
  public void sayHello(){
    this.sayHelloWithChinese();
    super.sayHello();
    this.sayGoodBye();
  }

  private void sayHelloWithChinese(){
    System.out.println("I am a Chinese version:");
  }

  private void sayGoodBye(){
    System.out.println("Good Bye!");
  }

}
