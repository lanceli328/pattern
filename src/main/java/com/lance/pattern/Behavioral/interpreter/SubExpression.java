package com.lance.pattern.Behavioral.interpreter;

import java.util.HashMap;

/**
 * Created by lihua on 25/4/2017.
 * email: lihua@seczone.cn
 */
public class SubExpression extends SymbolExpression {

  public SubExpression(Expression _left, Expression _right) {
    super(_left, _right);
  }

  //左右两个表达式相减
  public int interpreter(HashMap<String, Integer> var) {
    return super.left.interpreter(var) - super.right.interpreter(var);
  }
}
