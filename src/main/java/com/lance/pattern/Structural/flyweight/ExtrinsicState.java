package com.lance.pattern.Structural.flyweight;

/**
 * Created by lihua on 25/4/2017.
 * email: lihua@qq.com
 */
public class ExtrinsicState {

  private String subject;
  private String location;

  public String getSubject() {
    return subject;
  }

  public void setSubject(String subject) {
    this.subject = subject;
  }

  public String getLocation() {
    return location;
  }

  public void setLocation(String location) {
    this.location = location;
  }

  @Override
  public boolean equals(Object obj) {
    if (obj instanceof ExtrinsicState) {
      ExtrinsicState state = (ExtrinsicState) obj;
      return state.getLocation().equals(location) && state.getSubject().equals(subject);
    }
    return false;
  }

  @Override
  public int hashCode() {
    return subject.hashCode() + location.hashCode();
  }
}
