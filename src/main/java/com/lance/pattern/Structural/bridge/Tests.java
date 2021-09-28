package com.lance.pattern.Structural.bridge;

import org.junit.Test;

/**
 * Created by lihua on 1/4/2017.
 * email: lihua@qq.com
 */
public class Tests {

  @Test
  public void testBridge(){
    ColorInterface blue = new ColorBlueImpl();
    BrushAbstract brushAbstract = new BrushBig(blue);
    brushAbstract.brush();

    ColorInterface white = new ColorWhiteImpl();
    BrushAbstract brushAbstract1 = new BrushSmall(white);
    brushAbstract1.brush();
  }
}
