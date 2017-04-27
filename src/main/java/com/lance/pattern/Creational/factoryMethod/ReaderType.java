package com.lance.pattern.Creational.factoryMethod;

/**
 * Define the support class type
 */
public enum ReaderType {
  JPEG(JpegReader.class.getName()),
  GIF(GifReader.class.getName());

  private String className;

  ReaderType(String classFullName) {
    this.className = classFullName;
  }

  public String getClassName() {
    return this.className;
  }
}
