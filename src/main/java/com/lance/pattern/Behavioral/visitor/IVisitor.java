package com.lance.pattern.Behavioral.visitor;

/**
 * Created by lihua on 25/4/2017.
 * email: lihua@qq.com
 */
public interface IVisitor {

  void visit(CommonEmployee commonEmployee);

  void visit(Manager manager);

  String getSalary();
}
