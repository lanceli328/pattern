package com.lance.pattern.Creational.singleton;

import com.lance.pattern.Creational.singleton.target.Duck;

/**
 * Created by lihua on 30/3/2017.
 * email: lihua@qq.com
 */
public abstract class AbstractDuckFactory {

  /**
   * Just declare the make interface and not implement it
   * @return
   * @throws IllegalAccessException
   * @throws InstantiationException
   * @throws ClassNotFoundException
   */
  abstract Duck makeDuck()
      throws IllegalAccessException, InstantiationException, ClassNotFoundException;

  protected static Duck getInstance(String classFullName)
      throws ClassNotFoundException, IllegalAccessException, InstantiationException {
    return (Duck) Class.forName(classFullName).newInstance();
  }
}
