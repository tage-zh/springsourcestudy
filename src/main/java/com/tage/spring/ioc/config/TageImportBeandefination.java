package com.tage.spring.ioc.config;

import com.tage.spring.ioc.beans.Pig;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.beans.factory.support.RootBeanDefinition;
import org.springframework.context.annotation.ImportBeanDefinitionRegistrar;
import org.springframework.core.type.AnnotationMetadata;

/**
 * Brief info of the class TageImportBeandefination.
 **/
public class TageImportBeandefination implements ImportBeanDefinitionRegistrar {

  public void registerBeanDefinitions(AnnotationMetadata annotationMetadata,
      BeanDefinitionRegistry beanDefinitionRegistry) {
    if(beanDefinitionRegistry.containsBeanDefinition("com.tage.spring.ioc.beans.Cat")
    && beanDefinitionRegistry.containsBeanDefinition("com.tage.spring.ioc.beans.Bird")){
      beanDefinitionRegistry.registerBeanDefinition("pig",new RootBeanDefinition(Pig.class));
    }
  }
}
