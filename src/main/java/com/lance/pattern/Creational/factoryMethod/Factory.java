package com.lance.pattern.Creational.factoryMethod;

import java.util.HashMap;

/**
 * Created by lihua on 26/4/2017.
 * email: lihua@seczone.cn
 */
public class Factory {

  private static HashMap<String, ImageReader> readers = new HashMap<String, ImageReader>();

  public static ImageReader createReader(String type) throws Exception{
    ImageReader reader;
    if (readers.containsKey(type)) {
      return readers.get(type);
    } else {
      ReaderType readerType = ReaderType.valueOf(type.toUpperCase());
      reader = (ImageReader) Class.forName(readerType.getClassName()).newInstance();
      readers.put(type,reader);
    }
    return reader;
  }

}