package com.lance.pattern.Creational.abstractFactory;

import org.junit.Test;

/**
 * Created by lihua on 26/4/2017.
 * email: lihua@qq.com
 */
public class Tests {

  @Test
  public void test() {
    AbstractFactory factory = AbstractFactory.getFactory(Architecture.EMBER);
    CPU cpu = factory.createCPU();
    cpu.printCpu();

    factory = AbstractFactory.getFactory(Architecture.ENGINOLA);
    MMU mmu = factory.createMMU();
    mmu.printMmu();
  }

}
