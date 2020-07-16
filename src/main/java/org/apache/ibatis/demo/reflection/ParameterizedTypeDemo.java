package org.apache.ibatis.demo.reflection;

import java.lang.reflect.Field;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.List;

/**
 * TODO
 *
 * @author <a href = 'mailto:zht@orientdata.cn'>zht</a>
 * @since
 */
public class ParameterizedTypeDemo {

  private List<String> list;

  public static void main(String[] args) {
    Field[] fields = ParameterizedTypeDemo.class.getDeclaredFields();
    for (Field field : fields) {
      Type genericType = field.getGenericType();
      System.out.println((ParameterizedType)genericType);
    }


  }

  public List<String> getList() {
    return list;
  }

  public void setList(List<String> list) {
    this.list = list;
  }
}
