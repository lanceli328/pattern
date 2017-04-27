package com.lance.pattern.Structural.bridge;

/**
 * Created by lihua on 1/4/2017.
 * email: lihua@seczone.cn
 */
public abstract class BrushAbstract {

  private ColorInterface colorImpl;

  /**
   * Specify which implement will be used
   * @param color
   */
  public BrushAbstract(ColorInterface color){
    this.colorImpl = color;
  }

  public ColorInterface getColorImpl(){
    return colorImpl;
  }

  /**
   * Just declare a interface and will be implemented
   * in subclass
   */
  abstract void brush();
}
