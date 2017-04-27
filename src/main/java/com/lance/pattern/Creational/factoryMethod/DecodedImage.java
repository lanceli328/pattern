package com.lance.pattern.Creational.factoryMethod;

/**
 * Created by lihua on 26/4/2017.
 * email: lihua@seczone.cn
 */
class DecodedImage {

  private String image;

  public DecodedImage(String image) {
    this.image = image;
  }

  @Override
  public String toString() {
    return image + ": is decoded";
  }
}
