package com.lance.pattern.Behavioral.interpreter;

import java.util.HashMap;

/**
 * Created by lihua on 25/4/2017.
 * email: lihua@qq.com
 */
public abstract class Expression {
  public abstract int interpreter(HashMap<String,Integer> var);
}
