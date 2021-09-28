package com.lance.pattern.Structural.facade;

import org.junit.Test;

/**
 * Created by lihua on 1/4/2017.
 * email: lihua@qq.com
 */
public class Tests {

  private String context = "mail context";
  private String address = "address";

  /**
   * Without facade pattern, we need know the class details
   */
  @Test
  public void withoutFacade(){
    WriteLetter writeLetter = new WriteLetterImpl();
    writeLetter.writeContext(context);
    writeLetter.letterIntoEnvelope();
    writeLetter.fillEnvelope(address);
    writeLetter.sendLetter();
  }

  @Test
  public void withFacade(){
    SendMailer sendMailer = new SendMailerImpl();
    sendMailer.sendMailer(address,context);
  }

}
