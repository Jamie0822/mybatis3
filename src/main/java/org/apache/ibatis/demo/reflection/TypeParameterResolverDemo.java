package org.apache.ibatis.demo.reflection;

import org.apache.ibatis.reflection.TypeParameterResolver;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.TypeVariable;
import java.util.Arrays;
import java.util.List;

/**
 * {@link TypeParameterResolver} 示例
 *
 * @author <a href = 'mailto:zht@orientdata.cn'>zht</a>
 * @since
 */
public class TypeParameterResolverDemo {

  private String str;

  private List<String> list;

  public String getStr(List<String> list) {
    return list.toString();
  }

  public Integer getInteger(Double d) {
    return Integer.valueOf(d.toString());
  }

  public static void main(String[] args) {
    Field[] fields = TypeParameterResolverDemo.class.getDeclaredFields();
    for (Field field : fields) {
      System.out.println(TypeParameterResolver.resolveFieldType(field, ParameterizedType.class));
    }

    System.out.println("----------------------");

    Method[] declaredMethods = TypeParameterResolverDemo.class.getDeclaredMethods();
    for (Method declaredMethod : declaredMethods) {
      System.out.println(declaredMethod.getName() + "---" + Arrays.asList(TypeParameterResolver.resolveParamTypes(declaredMethod, ParameterizedType.class)));
      System.out.println(declaredMethod.getName() + "---" + Arrays.asList(TypeParameterResolver.resolveReturnType(declaredMethod, ParameterizedType.class)));
    }

  }


}
