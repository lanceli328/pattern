package com.lance.pattern.Creational.abstractFactory;

/**
 * Created by lihua on 26/4/2017.
 * email: lihua@qq.com
 */
public class EnginolaFactory extends AbstractFactory {

  @Override
  public CPU createCPU() {
    return new EnginolaCPU();
  }

  @Override
  public MMU createMMU() {
    return new EnginolaMMU();
  }
}
