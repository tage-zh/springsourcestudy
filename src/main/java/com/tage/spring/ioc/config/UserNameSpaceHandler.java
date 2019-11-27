package com.tage.spring.ioc.config;

import org.springframework.beans.factory.xml.NamespaceHandlerSupport;

/**
 * Brief info of the class UserNameSpaceHandler.
 **/
public class UserNameSpaceHandler extends NamespaceHandlerSupport {

  public void init() {
    registerBeanDefinitionParser("test",new UserBeanDefinitionParser());
  }
}
