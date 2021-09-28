package com.lance.pattern.Structural.flyweight;

import java.util.HashMap;

/**
 * Created by lihua on 25/4/2017.
 * email: lihua@qq.com
 */
public class SignInfoFactory {

  private static HashMap<ExtrinsicState, SignInfo> pool = new HashMap<ExtrinsicState, SignInfo>();
  private static HashMap<String, SignInfo> poolStr = new HashMap<String, SignInfo>();

  public static SignInfo getSignInfo(ExtrinsicState key) {
    SignInfo result = null;
    if (!pool.containsKey(key)) {
      result = new SignInfo();
      pool.put(key, result);
    } else {
      result = pool.get(key);
    }
    return result;
  }

  public static SignInfo getSignInfo(String key) {
    SignInfo result = null;
    if (!poolStr.containsKey(key)) {
      result = new SignInfo();
      poolStr.put(key, result);
    } else {
      result = poolStr.get(key);
    }
    return result;
  }

}
