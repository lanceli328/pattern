package com.lance.pattern.utils;

import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Lists;
import com.google.common.reflect.ClassPath;
import com.google.common.reflect.ClassPath.ClassInfo;
import java.io.IOException;
import java.util.List;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Created by lance on 2017/3/27.
 * Mail: lihua@seczone.cn
 */
public class ClassUtils {

  private static Logger logger = LoggerFactory.getLogger(ClassUtils.class);

  /**
   * Return all classes but not include interfaces which implement the specified interface
   *
   * @param interfaceClass
   * @param packagePath
   * @return
   */
  public static List<Class> getClassesByInterface(Class interfaceClass, String packagePath) {
    if (StringUtils.isEmpty(packagePath)) {
      packagePath = interfaceClass.getPackage().getName();
    }
    List<Class> classes = getClassesByPackage(packagePath, true);
    List<Class> interfaceClasses = Lists.newArrayList();
    for (Class currentClass : classes) {
      if (interfaceClass.equals(currentClass) || currentClass.isInterface()) {
        continue;
      }
      if (interfaceClass.isAssignableFrom(currentClass)) {
        interfaceClasses.add(currentClass);
      }
    }
    return interfaceClasses;
  }

  /**
   * Return all classes which are define in current package path.
   *
   * @param packagePath
   * @param isRecursived
   * @return
   */
  public static List<Class> getClassesByPackage(String packagePath, boolean isRecursived) {
    final ClassLoader loader = Thread.currentThread().getContextClassLoader();
    List<Class> classes = Lists.newArrayList();
    try {
      ClassPath classpath = ClassPath.from(loader);
      ImmutableSet<ClassInfo> classInfos;
      if (isRecursived) {
        classInfos = classpath.getTopLevelClassesRecursive(packagePath);
      } else {
        classInfos = classpath.getTopLevelClasses(packagePath);
      }
      for (ClassInfo classInfo : classInfos) {
        if (classInfo.getSimpleName().endsWith("_")) {
          continue;
        }
        classes.add(classInfo.getClass());
        logger.info("Found class: " + classInfo.getName());
      }
    } catch (IOException e) {
      logger.error("Cannot get class list from package: " + packagePath);
      e.printStackTrace();
    }
    return classes;
  }

}
