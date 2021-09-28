package com.lance.pattern.Behavioral.interpreter;

import java.util.HashMap;

/**
 * Created by lihua on 25/4/2017.
 * email: lihua@qq.com
 */
public class AddExpression extends SymbolExpression {

  public AddExpression(Expression _left, Expression _right) {
    super(_left, _right);
  }

  //把左右两个表达式运算的结果加起来
  public int interpreter(HashMap<String, Integer> var) {
    return super.left.interpreter(var) + super.right.interpreter(var);
  }
}
