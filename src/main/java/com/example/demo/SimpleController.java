package com.example.demo;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SimpleController {

  @GetMapping
  public String hello() {
    return "Hello World! This application is built, tested & deployed in Catalyst Appsail using Catalyst Pipelines!";
  }
}