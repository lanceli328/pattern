package com.lance.pattern.Behavioral.mediator;

/**
 * Created by lihua on 25/4/2017.
 * email: lihua@seczone.cn
 */
public class ConcreteColleague2 extends Colleague {

  public ConcreteColleague2(Mediator _mediator) {
    super(_mediator);
  }

  //自有方法 self-method
  public void selfMethod2() {
    //处理自己的业务逻辑
    System.out.println(this.getClass().getName() + "#" + "selfMethod2");
  }

  //依赖方法 dep-method
  public void depMethod2() {
    //处理自己的业务逻辑
    //自己不能处理的业务逻辑，委托给中介者处理
    System.out.println(this.getClass().getName() + "#" + "depMethod2");
    super.mediator.doSomething2();
  }
}
