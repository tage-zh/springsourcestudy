package com.tage.spring.ioc.main;

import java.io.IOException;
import java.io.InputStream;

/**
 * Brief info of the class ClassLoaderTest.
 **/
public class ClassLoaderTest {

  public static void main(String[] args)
      throws ClassNotFoundException, IllegalAccessException, InstantiationException {
    ClassLoader loader = new ClassLoader() {
      @Override
      public Class<?> loadClass(String name) throws ClassNotFoundException {
        String path = name.substring(name.lastIndexOf(".") + 1) + ".class";
        InputStream inputStream = getClass().getResourceAsStream(path);
        if (inputStream == null) {
            return super.loadClass(name);
        }
        try {
          byte[] b = new byte[inputStream.available()];
          inputStream.read(b);
          return defineClass(name, b, 0, b.length);
        } catch (IOException e) {
          e.printStackTrace();
        }
        return super.loadClass(name);
      }
    };
    String className = "com.tage.spring.ioc.main.ClassLoaderTest";
    Object o1 = ClassLoaderTest.class.getClassLoader().loadClass(className).newInstance();
    Object o2 = loader.loadClass(className).newInstance();
    System.out.println(o2 instanceof ClassLoaderTest);
  }

}
