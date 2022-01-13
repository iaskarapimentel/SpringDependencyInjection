package com.dci.spring.examples.exercise2.samples;

import org.springframework.beans.factory.annotation.Value;

import javax.annotation.PostConstruct;

public class ValueClass implements ValueInjection{

  @Value("${value.example.text}")
  private String text;

  @Value("${value.example.boolean}")
  private boolean bool;

  @Value("${value.example.int}")
  private int number;

  @Value("${value.example.long}")
  private long numberLong;

  @Override
  public String getText() {
    return this.text;
  }

  @Override
  public Boolean getBool() {
    return this.bool;
  }

  @Override
  public Integer getInt() {
    return this.number;
  }

  @Override
  public Long getLong() {
    return this.numberLong;
  }

  @PostConstruct
  public void postConstruct(){
    System.out.println();
    System.out.println("============================");
    System.out.println("Text value: "+getText());
    System.out.println("Boolean value: "+getBool());
    System.out.println("Int value: "+getInt());
    System.out.println("Long value: "+getLong());
    System.out.println("============================");
    System.out.println();
  }
}
