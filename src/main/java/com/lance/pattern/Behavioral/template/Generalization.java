package com.lance.pattern.Behavioral.template;

/**
 * Created by lihua on 26/4/2017.
 * email: lihua@seczone.cn
 */
public abstract class Generalization {

  // 1. Standardize the skeleton of an algorithm in a "template" method
  void findSolution() {
    stepOne();
    stepTwo();
    stepThr();
    if (isIncludeStepFor()){
      stepFor();
    }
  }

  // 2. Common implementations of individual steps are defined in base class
  private void stepOne() {
    System.out.println("Generalization.stepOne");
  }

  // 3. Steps requiring peculiar implementations are "placeholders" in the base class
  abstract void stepTwo();

  abstract void stepThr();

  // hook method
  abstract boolean isIncludeStepFor();

  void stepFor() {
    System.out.println("Generalization.stepFor");
  }

}
