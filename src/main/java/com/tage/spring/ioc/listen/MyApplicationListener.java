package com.tage.spring.ioc.listen;

import com.tage.spring.ioc.event.MyApplicationEvent;
import org.springframework.context.ApplicationListener;

/**
 * Brief info of the class MyApplicationListener.
 **/
public class MyApplicationListener implements
    ApplicationListener<MyApplicationEvent> {

  public void onApplicationEvent(MyApplicationEvent event) {
    System.out.println(event.getName());
  }
}
