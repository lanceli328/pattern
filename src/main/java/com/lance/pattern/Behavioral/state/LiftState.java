package com.lance.pattern.Behavioral.state;

/**
 * Created by lihua on 25/4/2017.
 * email: lihua@seczone.cn
 */
public abstract class LiftState implements ILift{

  protected Context context;

  public void setContext(Context _context) {
    this.context = _context;
  }

}
