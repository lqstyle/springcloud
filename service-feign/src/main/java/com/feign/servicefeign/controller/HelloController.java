package com.feign.servicefeign.controller;

import com.feign.servicefeign.service.ScheduleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author lucasliang
 * @date 24/02/2019 10:31 上午
 * @Description
 */
@RestController
public class HelloController {

  @Autowired
  private ScheduleService scheduleService;

  @GetMapping(value = "/hello")
  public String sayHi(@RequestParam String name) {
    return scheduleService.sayHiFromClientOne(name);
  }
}
