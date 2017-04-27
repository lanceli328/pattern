package com.lance.pattern.Structural.adapter;

import org.junit.Test;

/**
 * Created by lihua on 26/4/2017.
 * email: lihua@seczone.cn
 */
public class Before {

  class Line {
    public void draw(int x1, int y1, int x2, int y2) {
      System.out
          .println("Line from point A(" + x1 + ";" + y1 + "), to point B(" + x2 + ";" + y2 + ")");
    }
  }

  class Rectangle {
    public void draw(int x, int y, int width, int height) {
      System.out.println(
          "Rectangle with coordinate left-down point (" + x + ";" + y + "), width: " + width
              + ", height: " + height);
    }
  }

  @Test
  public void test() {
    Object[] shapes = {new Line(), new Rectangle()};
    int x1 = 10, y1 = 20;
    int x2 = 30, y2 = 60;
    int width = 40, height = 40;
    for (Object shape : shapes) {
      if (shape.getClass().getSimpleName().equals("Line")) {
        ((Line) shape).draw(x1, y1, x2, y2);
      } else if (shape.getClass().getSimpleName().equals("Rectangle")) {
        ((Rectangle) shape).draw(x2, y2, width, height);
      }
    }
  }

}
