package com.lance.pattern.Behavioral.interpreter;

/**
 * Created by lihua on 25/4/2017.
 * email: lihua@qq.com
 */
public abstract class SymbolExpression extends Expression {

  protected Expression left;
  protected Expression right;

  public SymbolExpression(Expression _left, Expression _right) {
    this.left = _left;
    this.right = _right;
  }

}
