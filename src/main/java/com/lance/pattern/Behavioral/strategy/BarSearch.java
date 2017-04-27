package com.lance.pattern.Behavioral.strategy;

/**
 * Created by lihua on 26/4/2017.
 * email: lihua@seczone.cn
 */
@SuppressWarnings("ALL")
class BarSearch extends StrategySearch {
  private int state = 1;

  protected void preProcess()  {
    System.out.print("PreProcess  ");
  }

  protected void postProcess() {
    System.out.print("PostProcess  ");
  }

  protected boolean search() {
    System.out.print("Search-" + state++ + "  ");
    return state == 3 ? true : false;
  }
}
