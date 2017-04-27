package com.lance.pattern.Structural.bridge;

/**
 * Created by lihua on 1/4/2017.
 * email: lihua@seczone.cn
 */
public class BrushSmall extends BrushAbstract {

  private static final String FLAG = "I am small brush";

  public BrushSmall(ColorInterface color) {
    super(color);
  }

  @Override
  void brush() {
    ColorInterface colorImpl = this.getColorImpl();
    String color = colorImpl.getColor();
    System.out.println(FLAG + ", and color is " + color);
  }
}
