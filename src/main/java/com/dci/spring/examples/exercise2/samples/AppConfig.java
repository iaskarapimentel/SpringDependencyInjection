package com.dci.spring.examples.exercise2.samples;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

//  @Beans are instance of a class managed by Spring Container
  @Bean
  public ComponentWithDependencies componentWithDependencies(ConstructorInjected constructorInjected, SetterInjected setterInjected) {

    // creates the instance injecting the constructor dependency
    ComponentWithDependencies componentWithDependencies =
        new ComponentWithDependencies(constructorInjected);

    // injects the setter dependency with the set
    componentWithDependencies.setSetterInjected(setterInjected);

    // the field dependency is injected with reflection, so we don't have to worry about it
    return componentWithDependencies;
  }

  @Bean
  public ConstructorInjected constructorInjected() {
    return new ConstructorClass();
  }

  @Bean
  public FieldInjected fieldInjected() {
    return new FieldClass();
  }

  @Bean
  public SetterInjected setterInjected() {
    return new SetterClass();
  }

  @Bean
  public ValueInjection valueInjected() {
    return new ValueClass();
  }

}
