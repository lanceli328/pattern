package com.lance.pattern.Behavioral.interpreter;

import com.google.common.collect.Maps;
import java.util.HashMap;
import org.junit.Test;

/**
 * Created by lihua on 25/4/2017.
 * email: lihua@seczone.cn
 */
public class Tests {

  @Test
  public void test() throws Exception {
    String expStr = "a+b-c";
    HashMap<String, Integer> var = Maps.newHashMap();
    var.put("a", 1);
    var.put("b", 8);
    var.put("c", 5);
    Calculator cal = new Calculator(expStr);
    System.out.println("运算结果为:" + expStr + "=" + cal.run(var));
  }
}
