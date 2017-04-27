package com.lance.pattern.Creational.singleton;

import com.lance.pattern.Creational.singleton.target.Duck;
import com.lance.pattern.Creational.singleton.target.WhiteDuck;
import com.lance.pattern.Creational.singleton.target.YellowDuck;

/**
 * Created by lihua on 30/3/2017.
 * email: lihua@seczone.cn
 */
public class SingleDuckFactory {

  private static SingleDuckFactory duckFactory = new SingleDuckFactory();

  /**
   * Empty construct method avoid new this object
   */
  private SingleDuckFactory(){
  }

  /**
   * Define the support class type
   */
  public enum DuckType{
    WHITE(WhiteDuck.class.getName()),
    YELLOW(YellowDuck.class.getName());

    private String className;

    DuckType(String classFullName){
      this.className = classFullName;
    }

    public String getClassName(){
      return this.className;
    }
  }

  /**
   * Get the single instance object
   * @return
   */
  public static SingleDuckFactory getInstance(){
    return duckFactory;
  }

  public Duck makeDuck(DuckType duckType)
      throws IllegalAccessException, InstantiationException, ClassNotFoundException {
    return getInstance(duckType.getClassName());
  }

  private Duck getInstance(String classFullName)
      throws ClassNotFoundException, IllegalAccessException, InstantiationException {
    return (Duck) Class.forName(classFullName).newInstance();
  }

}
