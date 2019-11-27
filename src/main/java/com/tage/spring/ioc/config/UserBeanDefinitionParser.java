package com.tage.spring.ioc.config;

import com.tage.spring.ioc.beans.User;
import org.springframework.beans.factory.support.AbstractBeanDefinition;
import org.springframework.beans.factory.support.BeanDefinitionBuilder;
import org.springframework.beans.factory.xml.AbstractBeanDefinitionParser;
import org.springframework.beans.factory.xml.AbstractSingleBeanDefinitionParser;
import org.springframework.beans.factory.xml.ParserContext;
import org.springframework.util.StringUtils;
import org.w3c.dom.Element;

/**
 * Brief info of the class UserBeanDefinitionOarser.
 **/
public class UserBeanDefinitionParser extends AbstractSingleBeanDefinitionParser {
  protected  Class getBeanClass(Element element){
    return User.class;
  }

  @Override
  protected void doParse(Element element, BeanDefinitionBuilder builder) {
    String name = element.getAttribute("userName");
    String email = element.getAttribute("email");
    String id = element.getAttribute("id");
    if (StringUtils.hasText(name)){
      builder.addPropertyValue("name",name);
    }
    if (StringUtils.hasText(email)){
      builder.addPropertyValue("email",email);
    }
    if (StringUtils.hasText(id)){
      builder.addPropertyValue("id",id);
    }
  }
}
