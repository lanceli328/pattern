package com.lance.pattern.Behavioral.mediator;

import org.junit.Test;

/**
 * Created by lihua on 25/4/2017.
 * email: lihua@qq.com
 */
public class Tests {

  /**
   * 中介者模式是一个非常好的封装模式，也是一个很容易被滥用的模式，一个对象依赖几个对象是再正 常不过的事情，但是纯理论家就会要求使用中介者模式来封装这种依赖关系，这是非常危险的信号，使用
   * 中介模式就必然会带来中介者的膨胀问题，这在一个项目中时很不恰当的，那到底在什么情况下使用中介 者模式呢?大家可以在如下的情况下尝试使用中介者模式: 大家可以在如下的情况下尝试使用中介者模式:
   * 1、 N 个对象之间产生了相互的依赖关系，其中 N 大于 2，注意是相互的依赖;
   * 2、 多个对象有依赖关系，但是依赖的行为尚不确定或者有发生改变的可能，在这种情况下一般建议采
   * 用中介者模式，降低变更引起的风险扩散;
   * 3、 产品开发。其中一个明显的例子就是 MVC 框架，把这个应用到产品中，可以提升产品的性能和扩展 性，但是作为项目开发就
   * 必，项目是以交付投产为目标，而产品以稳定、高效、扩展为宗旨。
   */
  @Test
  public void test() {
    Mediator mediator = new ConcreteMediator();
    ConcreteColleague1 colleague1 = new ConcreteColleague1(mediator);
    ConcreteColleague2 colleague2 = new ConcreteColleague2(mediator);
    mediator.setC1(colleague1);
    mediator.setC2(colleague2);

    colleague2.selfMethod2();
    // call colleague2 with mediator
    colleague2.depMethod2();
  }
}
