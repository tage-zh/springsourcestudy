package com.tage.spring.ioc.condition;

import org.springframework.context.annotation.Condition;
import org.springframework.context.annotation.ConditionContext;
import org.springframework.core.env.Environment;
import org.springframework.core.type.AnnotatedTypeMetadata;

/**
 * Brief info of the class WindowsCondition.
 **/
public class WindowsCondition implements Condition {

  public boolean matches(ConditionContext conditionContext,
      AnnotatedTypeMetadata annotatedTypeMetadata) {
    Environment env = conditionContext.getEnvironment();
    if(env.getProperty("os.name").contains("Windows"))
      return true;
    return false;
  }
}
