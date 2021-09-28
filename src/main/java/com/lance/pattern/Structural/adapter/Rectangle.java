package com.lance.pattern.Structural.adapter;

/**
 * Created by lihua on 26/4/2017.
 * email: lihua@qq.com
 */
class Rectangle {
  public void draw(int x, int y, int width, int height) {
    System.out.println("Rectangle with coordinate left-down point (" + x + ";" + y + "), width: " + width
        + ", height: " + height);
  }
}
