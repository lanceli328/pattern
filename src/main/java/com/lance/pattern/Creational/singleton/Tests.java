package com.lance.pattern.Creational.singleton;

import com.lance.pattern.Creational.singleton.SingleDuckFactory.DuckType;
import com.lance.pattern.Creational.singleton.target.Duck;
import org.junit.Test;

/**
 * Created by lihua on 30/3/2017.
 * email: lihua@qq.com
 */
public class Tests {

  @Test
  public void testFactory(){
    try {
      SingleDuckFactory duckFactory = SingleDuckFactory.getInstance();
      Duck whiteDuck = duckFactory.makeDuck(DuckType.WHITE);
      whiteDuck.printColor();
      whiteDuck.run();

      Duck yellowDuck = duckFactory.makeDuck(DuckType.YELLOW);
      yellowDuck.printColor();
      yellowDuck.run();
    } catch (IllegalAccessException e) {
      e.printStackTrace();
    } catch (InstantiationException e) {
      e.printStackTrace();
    } catch (ClassNotFoundException e) {
      e.printStackTrace();
    }
  }

}
