package com.dci.spring.examples.exercise2.samples;

public class FieldClass implements FieldInjected{

  @Override
  public String text() {
    return "I was injected in the setter!";
  }
}
