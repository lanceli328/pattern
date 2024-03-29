package com.lance.pattern.Behavioral.strategy;

/**
 * Created by lihua on 26/4/2017.
 * email: lihua@qq.com
 */
// 2. Bury implementation
@SuppressWarnings("ALL")
abstract class StrategySolution implements Strategy {
  // 3. Template Method
  public void solve() {
    start();
    while (nextTry() && !isSolution()) {}
    stop();
  }

  abstract void start();
  abstract boolean nextTry();
  abstract boolean isSolution();
  abstract void stop();
}
