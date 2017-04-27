package com.lance.pattern.Creational.singleton;

import com.lance.pattern.Creational.singleton.SingleDuckFactory.DuckType;
import com.lance.pattern.Creational.singleton.target.Duck;

/**
 * Created by lihua on 30/3/2017.
 * email: lihua@seczone.cn
 */
public class WhiteDuckFactory extends AbstractDuckFactory{

  /**
   * Make a white duck
   *
   * @return
   * @throws IllegalAccessException
   * @throws InstantiationException
   * @throws ClassNotFoundException
   */
  @Override
  Duck makeDuck() throws IllegalAccessException, InstantiationException, ClassNotFoundException {
    return getInstance(DuckType.WHITE.getClassName());
  }
}
