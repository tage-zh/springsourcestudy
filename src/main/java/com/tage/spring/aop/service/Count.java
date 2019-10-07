package com.tage.spring.aop.service;

import org.springframework.stereotype.Component;

/**
 * Brief info of the class Count.
 **/
@Component
public class Count {

  public int div(int i, int j) {
    return i / j;
  }

}
