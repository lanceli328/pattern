package com.lance.pattern.utils;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by lance on 2017/3/28.
 * Mail: lihua@seczone.cn
 */
public class StringUtils {

  public static boolean isEmpty(String str) {
    return str == null || str.length() < 1;
  }

  public static boolean isNotEmpty(String str) {
    return !isEmpty(str);
  }

  public static List<String> stringToList(String str) {
    List<String> strings = new ArrayList<String>();
    if (StringUtils.isNotEmpty(str) && str.contains(",")) {
      strings = Arrays.asList(str.split(","));
    } else {
      strings.add(str);
    }
    return strings;
  }

  public static String hash(String str) {
    byte[] hash = null;
    try {
      MessageDigest md = MessageDigest.getInstance("SHA-256");
      hash = md.digest(str.getBytes());
    } catch (NoSuchAlgorithmException e) {
      e.printStackTrace();
    }
    StringBuilder sb = new StringBuilder();
    for (int i = 0; i < hash.length; ++i) {
      String hex = Integer.toHexString(hash[i]);
      if (hex.length() == 1) {
        sb.append(0);
        sb.append(hex.charAt(hex.length() - 1));
      } else {
        sb.append(hex.substring(hex.length() - 2));
      }
    }
    return sb.toString();
  }

}
