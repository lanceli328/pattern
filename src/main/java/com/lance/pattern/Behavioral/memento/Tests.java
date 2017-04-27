package com.lance.pattern.Behavioral.memento;

import org.junit.Test;

/**
 * Created by lihua on 25/4/2017.
 * email: lihua@seczone.cn
 */
public class Tests {

  @Test
  public void test(){
    //定义出发起人
    Originator originator = new Originator();
    //定义出备忘录管理员
    Caretaker caretaker = new Caretaker();

    originator.setState("State1");
    originator.setState("State2");
    caretaker.addMemento( originator.save() );

    originator.setState("State3");
    caretaker.addMemento( originator.save() );

    originator.setState("State4");
    originator.restore( caretaker.getMemento() );
  }
}
