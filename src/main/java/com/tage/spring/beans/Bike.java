package com.tage.spring.beans;

/**
 * Brief info of the class Bike.
 **/
public class Bike {
  public Bike() {
    System.out.println("bike construct");
  }
  public void init(){
    System.out.println("bike init");
  }
  public void destroy(){
    System.out.println("bike destroy");
  }
}
