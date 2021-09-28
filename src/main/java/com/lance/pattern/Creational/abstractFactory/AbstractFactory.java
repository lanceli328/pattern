package com.lance.pattern.Creational.abstractFactory;

/**
 * Created by lihua on 26/4/2017.
 * email: lihua@qq.com
 */
abstract class AbstractFactory {

  private static final EmberFactory EMBER_TOOLKIT = new EmberFactory();
  private static final EnginolaFactory ENGINOLA_TOOLKIT = new EnginolaFactory();

  // Returns a concrete factory object that is an instance of the
  // concrete factory class appropriate for the given architecture.
  static AbstractFactory getFactory(Architecture architecture) {
    AbstractFactory factory = null;
    switch (architecture) {
      case ENGINOLA:
        factory = ENGINOLA_TOOLKIT;
      case EMBER:
        factory = EMBER_TOOLKIT;
    }
    return factory;
  }

  public abstract CPU createCPU();

  public abstract MMU createMMU();
}
