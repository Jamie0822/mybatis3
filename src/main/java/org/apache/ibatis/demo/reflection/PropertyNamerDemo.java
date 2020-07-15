package org.apache.ibatis.demo.reflection;

import org.apache.ibatis.reflection.property.PropertyNamer;
import org.junit.Test;

/**
 *  {@link PropertyNamer} 类 方法 功能测试
 *
 *
 */
public class PropertyNamerDemo {



  @Test
  public void methodToProperty() {
    String methodA = "isA";
    String methodB = "isabc";
    String methodC = "getA";

    System.out.println(PropertyNamer.methodToProperty(methodB));
  }


}
