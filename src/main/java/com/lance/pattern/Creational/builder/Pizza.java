package com.lance.pattern.Creational.builder;

/**
 * Created by lihua on 26/4/2017.
 * email: lihua@qq.com
 */
class Pizza {
  private String dough = "";
  private String sauce = "";
  private String topping = "";

  public void setDough(String dough) {
    this.dough = dough;
  }

  public void setSauce(String sauce) {
    this.sauce = sauce;
  }

  public void setTopping(String topping) {
    this.topping = topping;
  }

  public void printInfo(){
    System.out.println(this.dough + " " + this.sauce + " " + this.topping);
  }
}
