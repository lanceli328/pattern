package com.lance.pattern.Creational.factoryMethod;

import org.junit.Test;

/**
 * Created by lihua on 26/4/2017.
 * email: lihua@qq.com
 */
public class Tests {

  @Test
  public void test() throws Exception{
    String image = "test.jpeg";
    String format = image.substring(image.indexOf('.') + 1, (image.length()));
    ImageReader reader = Factory.createReader(format);
    assert reader != null;
    DecodedImage decodedImage = reader.getDecodeImage(image);
    System.out.println(decodedImage);
  }

}
