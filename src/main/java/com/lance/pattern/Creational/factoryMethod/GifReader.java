package com.lance.pattern.Creational.factoryMethod;

/**
 * Created by lihua on 26/4/2017.
 * email: lihua@qq.com
 */
class GifReader implements ImageReader {

  @Override
  public DecodedImage getDecodeImage(String image) {
    DecodedImage decodedImage = new DecodedImage("JPEG: "+image);
    return decodedImage;
  }
}
