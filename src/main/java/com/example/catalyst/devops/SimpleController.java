package com.example.catalyst.devops;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SimpleController {

  @GetMapping
  public String hello() {
    return "Hello World i'm build in Catalyst Pipelines!";
  }
}