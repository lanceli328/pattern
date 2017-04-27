package com.lance.pattern.Structural.decorator;

import org.junit.Test;

/**
 * Created by lihua on 3/4/2017.
 * email: lihua@seczone.cn
 */
public class Tests {

  @Test
  public void test(){
    Component originalComponent = new ContreteComponent();
    Decorator chinese = new DecoratorChinese();
    chinese.setComponent(originalComponent);
    chinese.sayHello();

    Decorator english = new DecoratorEnglish();
    english.setComponent(originalComponent);
    english.sayHello();
  }

}
