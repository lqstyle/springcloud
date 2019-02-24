package com.eureka.eurekaclient.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author lucasliang
 * @date 23/02/2019 10:59 下午
 * @Description
 */
@RestController
@RequestMapping("/eureka")
public class TestController {

  @Value("${server.port}")
  String port;

  @RequestMapping("/hello")
  public String home(@RequestParam(value = "", defaultValue = "client1") String name) {
    return "hi " + name + ", i am from port " + port;
  }
}
