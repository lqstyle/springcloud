package com.ribbon.serviceribbon.controller;

import com.ribbon.serviceribbon.service.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author lucasliang
 * @date 24/02/2019 10:12 上午
 * @Description
 */
@RestController
public class HelloControler {

  @Autowired
  private HelloService helloService;

  @GetMapping(value = "/hello")
  public String hi(@RequestParam String name) {
    return helloService.hiService( name );
  }

}
