package com.lance.pattern.Behavioral.template;

import org.junit.Test;

/**
 * Created by lihua on 26/4/2017.
 * email: lihua@seczone.cn
 */
public class Tests {

  /**
   * 初级程序员在写程序的时候经常会问高手“父类怎么调用子类的方法”，这个问题很有普遍性，反正我 是被问过好几回，那么父类是否可以调用子类的方法呢?我的回答是能，但强烈的、极度的不建议，怎么
   * 做呢? ! 把子类传递到父类的有参构造中，然后调用; ! 使用反射的方式调用，你使用了反射还有谁不能调用的?! ! 父类调用子类的静态方法。
   * 这三种都是父类直接调用子类的方法，好用不?好用!解决问题了吗?解决了!项目中允许使用不? 不允许!我就一直没有搞懂为什么要父类调用子类的方法，如果一定要调用子类，那为什么要继承它呢?
   *
   * 您的设计模式 搞不懂。其实这个问题可以换个角度去理解，在重写了父类部分方法后，再调用从父类继承的方法，产生 不同的结果(而这正是模板方法模式)，这是不是也可以理解为父类调用了子类的方法呢?你修改了子类，
   * 影响了父类的结果，模板方法模式就是这样效果。
   *
   * http://wiki.jikexueyuan.com/project/design-pattern-behavior/template-one.html
   * 模板方法

   一个模板方法是定义在抽象类中的、把基本操作方法组合在一起形成一个总算法或一个总行为的方法。这个模板方法定义在抽象类中，并由子类不加以修改地完全继承下来。模板方法是一个具体方法，它给出了一个顶层逻辑框架，而逻辑的组成步骤在抽象类中可以是具体方法，也可以是抽象方法。由于模板方法是具体方法，因此模板方法模式中的抽象层只能是抽象类，而不是接口。

   基本方法
   基本方法是实现算法各个步骤的方法，是模板方法的组成部分。基本方法又可以分为三种：抽象方法（Abstract Method）、具体方法（Concrete Method）和钩子方法（Hook Method）。

   (1) 抽象方法：一个抽象方法由抽象类声明、由其具体子类实现。在 C# 语言里一个抽象方法以 abstract 关键字标识。

   (2) 具体方法：一个具体方法由一个抽象类或具体类声明并实现，其子类可以进行覆盖也可以直接继承。

   (3) 钩子方法：一个钩子方法由一个抽象类或具体类声明并实现，而其子类可能会加以扩展。通常在父类中给出的实现是一个空实现（可使用 virtual 关键字将其定义为虚函数），并以该空实现作为方法的默认实现，当然钩子方法也可以提供一个非空的默认实现。

   在模板方法模式中，钩子方法有两类：第一类钩子方法可以与一些具体步骤“挂钩”，以实现在不同条件下执行模板方法中的不同步骤，这类钩子方法的返回类型通常是 bool 类型的，这类方法名一般为 IsXXX()，用于对某个条件进行判断，如果条件满足则执行某一步骤，否则将不执行，如下代码片段所示：

   ……
   //模板方法
   public void TemplateMethod()
   {
   Open();
   Display();
   //通过钩子方法来确定某步骤是否执行
   if (IsPrint())
   {
   Print();
   }
   }

   //钩子方法
   public bool IsPrint()
   {
   return true;
   }
   ……
   在代码中 IsPrint() 方法即是钩子方法，它可以决定 Print() 方法是否执行，一般情况下，钩子方法的返回值为 true，如果不希望某方法执行，可以在其子类中覆盖钩子方法，将其返回值改为 false 即可，这种类型的钩子方法可以控制方法的执行，对一个算法进行约束。

   还有一类钩子方法就是实现体为空的具体方法，子类可以根据需要覆盖或者继承这些钩子方法，与抽象方法相比，这类钩子方法的好处在于子类如果没有覆盖父类中定义的钩子方法，编译可以正常通过，但是如果没有覆盖父类中声明的抽象方法，编译将报错。

   在模板方法模式中，抽象类的典型代码如下：

   abstract class AbstractClass
   {
   //模板方法
   public void TemplateMethod()
   {
   PrimitiveOperation1();
   PrimitiveOperation2();
   PrimitiveOperation3();
   }

   //基本方法—具体方法
   public void PrimitiveOperation1()
   {
   //实现代码
   }

   //基本方法—抽象方法
   public abstract void PrimitiveOperation2();

   //基本方法—钩子方法
   public virtual void PrimitiveOperation3()
   {  }
   }
   */
  @Test
  public void test() {
    Generalization algorithm = new Realization();
    algorithm.findSolution();
  }

}
