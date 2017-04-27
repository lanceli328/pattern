package com.lance.pattern.Structural.bridge;

/**
 * Created by lihua on 1/4/2017.
 * email: lihua@seczone.cn
 */
public class ColorWhiteImpl implements ColorInterface{

  @Override
  public String getColor() {
    return "White";
  }
}
