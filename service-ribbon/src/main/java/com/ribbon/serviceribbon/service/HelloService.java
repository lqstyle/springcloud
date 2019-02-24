package com.ribbon.serviceribbon.service;


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

  public String hiService(String name) {
    return restTemplate
        .getForObject("http://service-eureka/eureka/hello?name=" + name, String.class);
  }

}
