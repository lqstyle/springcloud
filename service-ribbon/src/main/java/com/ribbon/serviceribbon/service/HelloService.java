package com.ribbon.serviceribbon.service;


import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.netflix.ribbon.proxy.annotation.Hystrix;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

/**
 * @author lucasliang
 * @date 24/02/2019 10:13 上午
 * @Description
 */
@Service
public class HelloService {

  @Autowired
  private RestTemplate restTemplate;

/*
  @HystrixCommand(fallbackMethod = "hiError")
*/
  public String hiService(String name) {
    return restTemplate
        .getForObject("http://service-eureka/eureka/hello?name=" + name, String.class);
  }

  public String hiError(String name) {
    return "hello," + name + ",sorry,error!";
  }

}
