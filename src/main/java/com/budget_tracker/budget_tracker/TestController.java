package com.budget_tracker.budget_tracker;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

  @RequestMapping("/")
  public String home() {
    return "Hello world";
  }

}
