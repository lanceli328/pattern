package com.lance.pattern.Structural.adapter;

/**
 * Created by lihua on 26/4/2017.
 * email: lihua@seczone.cn
 */
class LineAdapter implements Shape {
  private Line adaptee;

  public LineAdapter(Line line) {
    this.adaptee = line;
  }

  @Override
  public void draw(int x1, int y1, int x2, int y2) {
    adaptee.draw(x1, y1, x2, y2);
  }
}
