package com.tage.spring.config;

import com.tage.spring.beans.Monkey;
import org.springframework.beans.factory.FactoryBean;

/**
 * Brief info of the class TageFactoryBean.
 **/
public class TageFactoryBean implements FactoryBean<Monkey> {

  public Monkey getObject() throws Exception {
    return new Monkey();
  }

  public Class<?> getObjectType() {
    return Monkey.class;
  }

  public boolean isSingleton() {
    return true;
  }
}
