package com.hello_world;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class HelloWorldApp {

  @RequestMapping("/")
  @ResponseBody
  public String home() {
    return "{\"message\":\"Hello World, Spring Boot!\"}";
  }

  public static void main(String[] args) {
    SpringApplication.run(HelloWorldApp.class, args);
  }

}
