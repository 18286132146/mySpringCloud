package com.miguan.springcloud.springcloudController;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ConfigClient {
    @Value("${server.port}")
    private String port;
    @Value("${spring.applications.name}")
    private String applicationName;
    @GetMapping("/config")
    public String config(){
      String content="applicationName:"+applicationName+", port: "+port;
      System.out.println(content);
      return port;
    }
}
