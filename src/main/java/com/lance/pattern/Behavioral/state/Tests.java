package com.lance.pattern.Behavioral.state;

import org.junit.Test;

/**
 * Created by lihua on 25/4/2017.
 * email: lihua@qq.com
 */
public class Tests {

  @Test
  public void test() {
    Context context = new Context();
    context.run();
    context.stop();
    context.open();
    context.close();
  }
}
