package com.tage.spring.ioc.main;

public class MainTest {

  private static final int _1_MB_SIZE = 1024 * 1024;

  public static void main(String[] args) throws InterruptedException {
    byte[] allocate1, allocate2, allocate3, allocate4;
    allocate1=new byte[2*_1_MB_SIZE];
    allocate2=new byte[2*_1_MB_SIZE];
    allocate3=new byte[2*_1_MB_SIZE];
    allocate4=new byte[4*_1_MB_SIZE];
    Thread.sleep(1000);
  }
}
