package com.lance.pattern.Structural.adapter;

/**
 * Created by lihua on 26/4/2017.
 * email: lihua@seczone.cn
 */
class Line {
  public void draw(int x1, int y1, int x2, int y2) {
    System.out.println("Line from point A(" + x1 + ";" + y1 + "), to point B(" + x2 + ";" + y2 + ")");
  }
}