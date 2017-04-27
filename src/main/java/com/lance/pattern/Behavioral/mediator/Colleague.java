package com.lance.pattern.Behavioral.mediator;

/**
 * Created by lihua on 25/4/2017.
 * email: lihua@seczone.cn
 */
public abstract class Colleague {

  protected Mediator mediator;

  public Colleague(Mediator _mediator) {
    this.mediator = _mediator;
  }
}
