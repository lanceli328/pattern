package com.lance.pattern.Behavioral.visitor;

import java.util.ArrayList;
import java.util.List;
import org.junit.Test;

/**
 * Created by lihua on 25/4/2017.
 * email: lihua@qq.com
 */
public class Tests {

  @Test
  public void test() {
    List<Employee> empList = new ArrayList<Employee>();

    CommonEmployee zhangSan = new CommonEmployee();
    zhangSan.setJob("编写Java程序，绝对的蓝领、苦工加搬运工");
    zhangSan.setName("张三");
    zhangSan.setSalary(1800);
    zhangSan.setSex(Employee.MALE);
    empList.add(zhangSan);

    CommonEmployee liSi = new CommonEmployee();
    liSi.setJob("页面美工，审美素质 不流行了!");
    liSi.setName("李四");
    liSi.setSalary(1900);
    liSi.setSex(Employee.FEMALE);
    empList.add(liSi);

    Manager wangWu = new Manager();
    wangWu.setName("王五");
    wangWu.setPerformance("基本上是负值，但是我会拍马屁呀");
    wangWu.setSalary(18750);
    wangWu.setSex(Employee.MALE);
    empList.add(wangWu);

    for (Employee emp : empList) {
      IVisitor visitor = new Visitor();
      emp.accept(visitor);
      System.out.println("Salary:" + visitor.getSalary());
    }
  }
}
