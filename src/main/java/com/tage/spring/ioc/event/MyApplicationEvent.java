package com.tage.spring.ioc.event;

import org.springframework.context.ApplicationEvent;

/**
 * Brief info of the class MyApplicationEvent.
 **/
public class MyApplicationEvent extends ApplicationEvent {

  private String name;

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  /**
   * Create a new ApplicationEvent.
   *
   * @param source the object on which the event initially occurred (never {@code null})
   */
  public MyApplicationEvent(Object source) {
    super(source);
  }

  public MyApplicationEvent(Object source, String name) {
    this(source);
    this.name = name;
  }
}
