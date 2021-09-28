package com.lance.pattern.Structural.facade;

/**
 * Created by lihua on 1/4/2017.
 * email: lihua@qq.com
 */
public class WriteLetterImpl implements WriteLetter {

  @Override
  public void writeContext(String context) {
    System.out.println(context);
  }

  @Override
  public void fillEnvelope(String address) {
    System.out.println(address);
  }

  @Override
  public void letterIntoEnvelope() {
    System.out.println("put letter into envelope");
  }

  @Override
  public void sendLetter() {
    System.out.println("send ...");
  }
}
