package com.tage.spring.ioc.main;

import com.tage.spring.ioc.beans.User;
import com.tage.spring.ioc.event.MyApplicationEvent;
import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationEvent;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;

/**
 * Brief info of the class XMLBeanTest.
 **/
public class XMLBeanTest {

  public static int a =2;
  public static final int c =3;

  static {
    System.out.println(111);
  }

  public static void main(String[] args) {
//    XmlBeanFactory xmlBeanFactory = new XmlBeanFactory(new ClassPathResource("beans.xml"));
//    ApplicationContext xmlBeanFactory = new ClassPathXmlApplicationContext("beans.xml");
    ApplicationContext xmlBeanFactory = new ClassPathXmlApplicationContext("beans.xml"){
      @Override
      protected void initPropertySources() {
       getEnvironment().setRequiredProperties("VARS");
      }

      @Override
      protected void customizeBeanFactory(DefaultListableBeanFactory beanFactory) {
        super.customizeBeanFactory(beanFactory);
      }
    };
    xmlBeanFactory.publishEvent(new MyApplicationEvent(new XMLBeanTest(),"test"));
    User user = (User) xmlBeanFactory.getBean("testBean");
    System.out.println(user.getName());
    test();
    XMLBeanTest xmlBeanTest = new XMLBeanTest();
    xmlBeanTest.trying();
  }

  public static void test(){
    System.out.println(222);
  }

  public void trying(){
    System.out.println(222);
  }

}
