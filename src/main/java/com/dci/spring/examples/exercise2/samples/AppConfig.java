package com.dci.spring.examples.exercise2.samples;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

  @Bean
  public ComponentWithDependencies componentWithDependencies(
      ConstructorInjected constructorInjected, SetterInjected setterInjected) {
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
    return null;
  }

  @Bean
  public FieldInjected fieldInjected() {
    return null;
  }

  @Bean
  public SetterInjected setterInjected() {
    return null;
  }
}
