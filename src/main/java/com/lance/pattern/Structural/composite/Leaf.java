package com.lance.pattern.Structural.composite;

/**
 * Created by lihua on 4/4/2017.
 * email: lihua@seczone.cn
 */
public class Leaf extends Component{

  public Leaf(String name) {
    super(name);
  }

  @Override
  public void execute() {
    System.out.println("I am a leaf and my name is: " + this.getName());
  }

  @Override
  boolean isNode() {
    return false;
  }
}
