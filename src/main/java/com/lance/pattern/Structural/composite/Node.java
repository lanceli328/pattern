package com.lance.pattern.Structural.composite;

import com.google.common.collect.Lists;
import java.util.Iterator;
import java.util.List;

/**
 * Created by lihua on 4/4/2017.
 * email: lihua@seczone.cn
 */
public class Node extends Component{

  public List<Component> componentList = Lists.newArrayList();

  public Node(String name) {
    super(name);
  }

  @Override
  public void execute() {
    System.out.println("I am a node and my name is " + this.getName());
  }

  @Override
  boolean isNode() {
    return true;
  }

  public void addSubNode(Component component){
    component.setParent(this);
    componentList.add(component);
  }

  public Iterator<Component> getSubNodes(){
    return componentList.iterator();
  }

}
