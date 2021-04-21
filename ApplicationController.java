package com.ipro1.springboot;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class ApplicationController {

  @GetMapping("/hellotest")
  public String index() {
    return "hello.html";
  }

}