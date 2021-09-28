package com.lance.pattern.Structural.composite;

import java.util.Iterator;
import org.junit.Test;

/**
 * Created by lihua on 4/4/2017.
 * email: lihua@qq.com
 */
public class Tests {

  @Test
  public void test(){
    Node root = new Node("root");
    Node node1 = new Node("node1");
    Leaf leaf1 = new Leaf("leaf1");
    node1.addSubNode(leaf1);
    root.addSubNode(node1);
    traversalNodes(root);
  }

  private void traversalNodes(Node root){
    Iterator<Component> componentIterator = root.getSubNodes();
    while(componentIterator.hasNext()){
      Component component = componentIterator.next();
      if (component.isNode()){
        component.execute();
        Node node = (Node) component;
        traversalNodes(node);
      } else {
        component.execute();
      }
    }
  }
}
