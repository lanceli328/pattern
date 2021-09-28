package com.lance.pattern.utils;

import com.google.common.collect.Maps;
import java.util.HashMap;

/**
 * <p>
 * Title: RequestFactory class
 * </p>
 *
 * @author Lance Li
 * @version 1.0.0
 */
public class ObjectFactory {
  private HashMap<String, String> classTypeMap = Maps.newHashMap();

  /**
   * Register your class to framework, and then we can easy to get it
   * with the type name, for example, I create a new class A and want to share
   * it to framework or whole project, then I register it with className and
   * class path
   *
   * @param type : simple class name
   * @param classPath : class full path, include the package name and class name, for example:
   * cn.test.xss.core.common.ObjectFactory
   */
  public synchronized void register(String type, String classPath) {
    if (classTypeMap.containsKey(type)) {
      classTypeMap.remove(type);
    }
    classTypeMap.put(type, classPath);
  }

  /**
   * Get a new object with class type.
   *
   * @return Request object who implement the base request interface.
   */
  public <T> T newObject(String type)
      throws ClassNotFoundException, IllegalAccessException, InstantiationException {
    String classPath = classTypeMap.get(type);
    return (T) Class.forName(classPath).newInstance();
  }

  /**
   * Get a new object with class type, if type is not found in this system,
   * then we will try to merge the classPath and key to generate a object.
   *
   * @return Request object who implement the base request interface.
   */
  public <T> T newObject(String key, String classPath)
      throws ClassNotFoundException, IllegalAccessException, InstantiationException {
    String mapPath = classTypeMap.get(key);
    if (StringUtils.isEmpty(mapPath)) {
      classPath = key.contains(".") ? key : classPath + "." + key;
    } else {
      classPath = mapPath;
    }
    return (T) Class.forName(classPath).newInstance();
  }

}
