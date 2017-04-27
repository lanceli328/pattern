package com.lance.pattern.Structural.adapter;

import org.junit.Test;

/**
 * Created by lihua on 26/4/2017.
 * email: lihua@seczone.cn
 */
public class Tests {

  /**
   * 贫血领域模型和充血领域模型，有什么区别呢?在一个对象中不存储实体状态以及对象之间的关系的就叫做贫血对象，
   * 上升到领域模型中就是贫血领域模型，有实体状态和对象关系的模型的就是充血领域模型。
   */
  @Test
  public void test(){
    Shape[] shapes = {new RectangleAdapter(new Rectangle()),
        new LineAdapter(new Line())};
    int x1 = 10, y1 = 20;
    int x2 = 30, y2 = 60;
    for (Shape shape : shapes) {
      shape.draw(x1, y1, x2, y2);
    }
  }
}
