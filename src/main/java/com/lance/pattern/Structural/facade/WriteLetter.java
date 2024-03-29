package com.lance.pattern.Structural.facade;

/**
 * Created by lihua on 1/4/2017.
 * email: lihua@qq.com
 */
public interface WriteLetter {
  void writeContext(String context);
  void fillEnvelope(String address);
  void letterIntoEnvelope();
  void sendLetter();
}
