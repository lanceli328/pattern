package com.lance.pattern.utils;

import java.util.List;
import java.util.Map;

/**
 * Created by lance on 2017/3/28.
 * Mail: lihua@seczone.cn
 */
public class CollectionUtils {

  public static boolean isEmpty(List<?> list) {
    return list == null || list.size() < 1;
  }

  public static boolean isNotEmpty(List<?> list) {
    return !isEmpty(list);
  }

  public static boolean isEmpty(Map<?, ?> map) {
    return map == null || map.size() < 1;
  }

  public static boolean isNotEmpty(Map<?, ?> map) {
    return !isEmpty(map);
  }

  public static boolean isEmpty(Object[] list) {
    return list == null || list.length < 1;
  }

  public static boolean isNotEmpty(Object[] list) {
    return !isEmpty(list);
  }

  public static <T> List<T> mergeList(List<T> list1, List<T> list2) {
    if (isEmpty(list1)) {
      return list2;
    }
    if (isEmpty(list2)) {
      return list1;
    }
    for (T t : list2) {
      if (!list1.contains(t)) {
        list1.add(t);
      }
    }
    return list1;
  }

}
