package com.lance.pattern.Creational.factoryMethod;

/**
 * Created by lihua on 26/4/2017.
 * email: lihua@seczone.cn
 */
interface ImageReader {
  DecodedImage getDecodeImage(String fileName);
}
