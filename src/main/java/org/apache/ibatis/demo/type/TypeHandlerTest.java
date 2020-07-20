package org.apache.ibatis.demo.type;

import org.apache.ibatis.type.TypeHandler;
import org.apache.ibatis.type.TypeReference;

/**
 * {@link TypeHandler} 示例
 *
 * @author <a href = "mailto:778261163@qq.com"> zht </a>"
 * @since
 */
public class TypeHandlerTest<T> extends TypeReference<String> {

  public static void main(String[] args) {

    TypeHandlerTest<String> typeHandlerTest = new TypeHandlerTest<>();
    System.out.println(typeHandlerTest.toString());

  }


  public TypeHandlerTest() {
    super();
  }

  @Override
  public String toString() {
    return "TypeHandlerTest{} " + super.toString();
  }
}
