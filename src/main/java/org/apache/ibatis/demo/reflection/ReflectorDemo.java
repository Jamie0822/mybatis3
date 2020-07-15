package org.apache.ibatis.demo.reflection;

import org.apache.ibatis.demo.mybatis.dataobject.ArticleDO;
import org.apache.ibatis.reflection.Reflector;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * TODO
 *
 * @author <a href = "mailto:778261163@qq.com"> zht </a>"
 * @since
 */
public class ReflectorDemo {

  public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException, IllegalAccessException, InstantiationException, ClassNotFoundException {

    Method method = ArticleDO.class.getMethod("setAuthor", String.class, Integer.class);
    Class<? extends Class> aClass = ArticleDO.class.getClass();
    Class<?> c = Reflector.class;
    Constructor<?> declaredConstructor = c.getDeclaredConstructor(aClass);
    Method getSignatureMethod = c.getDeclaredMethod("getSignature", Method.class);
    getSignatureMethod.setAccessible(true);
    String signature = (String)getSignatureMethod.invoke(declaredConstructor.newInstance(ArticleDO.class), method);
    System.out.println(signature);
  }

}
