package com.lance.pattern.Creational.abstractFactory;

/**
 * Created by lihua on 26/4/2017.
 * email: lihua@seczone.cn
 */ // class EmberFactory
class EmberFactory extends AbstractFactory {

  @Override
  public CPU createCPU() {
    return new EmberCPU();
  }

  @Override
  public MMU createMMU() {
    return new EmberMMU();
  }
}
