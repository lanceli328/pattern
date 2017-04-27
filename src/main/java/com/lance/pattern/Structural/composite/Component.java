package com.lance.pattern.Structural.composite;

/**
 * Created by lihua on 4/4/2017.
 * email: lihua@seczone.cn
 */
public abstract class Component {

  protected String name;
  protected Component parent;

  public Component(String name){
    this.name = name;
  }

  /**
   * The core function need be implemented in
   * sub class
   * @return
   */
  abstract void execute();

  /**
   * Is node
   * @return
   */
  abstract boolean isNode();

  public String getName(){
    return this.name;
  }

  /**
   * Set parent node
   * @param component
   */
  public void setParent(Component component){
    this.parent = component;
  }

  /**
   * Get parent node
   * @return
   */
  public Component getParent(){
    return this.parent;
  }

}
