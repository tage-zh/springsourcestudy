package com.tage.spring.jvm;

/**
 * Brief info of the class MyClassLoader.
 **/
public class MyClassLoader extends ClassLoader {
  public Class<?> defineClass(String name,byte[] b) throws ClassNotFoundException {
    return super.defineClass(name,b,0,b.length);
  }
}
