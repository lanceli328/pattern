package com.lance.pattern.Behavioral.chainOfResponsibility;

import java.util.ArrayList;
import java.util.Random;
import org.junit.Test;

/**
 * Created by lihua on 24/4/2017.
 * email: lihua@qq.com
 */
public class Tests {

  @Test
  public void test() {
    Random rand = new Random();
    ArrayList<Subject> arrayList = new ArrayList();
    for (int i = 0; i < 5; i++) {
      arrayList.add(new MailSubject(rand.nextInt(3), "我要出去逛街"+i));
    }

    Handler firstHandler = new HexHandler(0);
    Handler secondHandler = new OctHandler(1);
    firstHandler.setNextHandler(secondHandler);

    for (Subject subject : arrayList){
      firstHandler.handle(subject);
    }
  }
}
