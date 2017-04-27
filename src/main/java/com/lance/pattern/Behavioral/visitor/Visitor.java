package com.lance.pattern.Behavioral.visitor;

/**
 * Created by lihua on 25/4/2017.
 * email: lihua@seczone.cn
 */
public class Visitor implements IVisitor {

  private int salary = 0;

  @Override
  public void visit(CommonEmployee commonEmployee) {
    System.out.println("Visit Employee:" + commonEmployee.getName());
    salary = doBusiness(commonEmployee);
  }

  @Override
  public void visit(Manager manager) {
    System.out.println("Visit Manager:" + manager.getName());
    salary = doBusiness(manager);
  }

  @Override
  public String getSalary() {
    return "" + salary;
  }

  private int doBusiness(Employee employee){
    return employee.getSalary();
  }
}
