package com.lance.pattern.Behavioral.interpreter;

import java.util.HashMap;
import java.util.Stack;

/**
 * Created by lihua on 25/4/2017.
 * email: lihua@qq.com
 */
public class Calculator {

  private Expression expression;

  //构造函数传参,并解析
  public Calculator(String expStr) {
    Stack<Expression> stack = new Stack<Expression>();
    char[] charArray = expStr.toCharArray();

    Expression left = null;
    Expression right = null;
    for (int i = 0; i < charArray.length; i++) {
      switch (charArray[i]) {
        case '+': //加法
          left = stack.pop();
          right = new VarExpression(String.valueOf(charArray[++i]));
          stack.push(new AddExpression(left, right));
          break;
        case '-':
          left = stack.pop();
          right = new VarExpression(String.valueOf(charArray[++i]));
          stack.push(new SubExpression(left, right));
          break;
        default: //公式中的变量
          stack.push(new VarExpression(String.valueOf(charArray[i])));
      }
    }
    this.expression = stack.pop();
  }

  public int run(HashMap<String, Integer> var) {
    return this.expression.interpreter(var);
  }

}
