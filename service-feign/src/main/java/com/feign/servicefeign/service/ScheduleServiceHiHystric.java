package com.feign.servicefeign.service;

import org.springframework.stereotype.Component;

/**
 * @author lucasliang
 * @date 24/02/2019 10:47 上午
 * @Description
 */
@Component
public class ScheduleServiceHiHystric implements  ScheduleService {
  @Override
  public String sayHiFromClientOne(String name) {
    return "sorry "+name;
  }
}
