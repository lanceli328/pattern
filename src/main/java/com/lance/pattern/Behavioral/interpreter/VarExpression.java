package com.lance.pattern.Behavioral.interpreter;

import java.util.HashMap;

/**
 * Created by lihua on 25/4/2017.
 * email: lihua@seczone.cn
 */
public class VarExpression extends Expression {

  private String key;

  public VarExpression(String _key) {
    this.key = _key;
  }

  public int interpreter(HashMap<String, Integer> var) {
    return var.get(this.key);
  }
}
