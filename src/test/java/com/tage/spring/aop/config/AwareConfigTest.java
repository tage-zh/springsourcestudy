package com.tage.spring.aop.config;

import static org.junit.Assert.*;

import com.tage.spring.aop.service.Count;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.junit.Test;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.core.io.ClassPathResource;

public class AwareConfigTest {
  private static final List<String> FIELD_CURRENCY_ARRAYS = new ArrayList<String>() {
    {
      add("BIF"); add("BYR"); add("CLP"); add("COP"); add("DJF"); add("GNF"); add("HUF");
      add("IDR"); add("ISK"); add("JPY"); add("KMF"); add("KRW"); add("LAK"); add("PYG");
      add("RWF"); add("TWD"); add("UGX"); add("VND"); add("VUV"); add("XAF"); add("XOF");
      add("XPF");
    }
  };

  @Test
  public void light() {
//    AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(AwareConfig.class);
//    Count count = (Count)applicationContext.getBean("count");
//    Count count1 = (Count)applicationContext.getBean("count");
//    System.out.println(count==count1);
////    System.out.println(Arrays.asList(applicationContext.getBeanDefinitionNames()));
//    applicationContext.close();
//    new XmlBeanFactory(new ClassPathResource(""));
//    int a =44;
//    switch (a){
//      case 1:
//        if(2>3){
//          System.out.println(1111);
//        }
//        break;
//       default:
//         System.out.println(2222);
//        break;
//    }

    BigDecimal a = new BigDecimal("10000100001000.999");
    System.out.println(a);
    System.out.println(new BigDecimal(a.longValue()));
    System.out.println(FIELD_CURRENCY_ARRAYS.contains("UGX"));
  }
}