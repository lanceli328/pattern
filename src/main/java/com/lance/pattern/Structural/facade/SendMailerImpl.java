package com.lance.pattern.Structural.facade;

/**
 * Created by lihua on 1/4/2017.
 * email: lihua@qq.com
 */
public class SendMailerImpl implements SendMailer {

  @Override
  public void sendMailer(String address, String context) {
    WriteLetter writeLellter = new WriteLetterImpl();
    writeLellter.writeContext(context);
    writeLellter.fillEnvelope(address);
    writeLellter.letterIntoEnvelope();
    writeLellter.sendLetter();
  }
}
