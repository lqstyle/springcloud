package com.feign.servicefeign.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @author lucasliang
 * @date 24/02/2019 10:30 上午
 * @Description
 */
@FeignClient(value = "service-eureka")
public interface ScheduleService {

  @RequestMapping(value = "/eureka/hello", method = RequestMethod.GET)
  String sayHiFromClientOne(@RequestParam(value = "name") String name);

}
