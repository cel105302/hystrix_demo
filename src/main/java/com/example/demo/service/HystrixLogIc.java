package com.example.demo.service;

import com.example.demo.service.fallback.HystrixLogIcCallbackFanctory;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@FeignClient(value = "YOBTC-PC-API",fallbackFactory = HystrixLogIcCallbackFanctory.class)
public interface HystrixLogIc {
   @RequestMapping(value = "/ddd", method = RequestMethod.GET)
   public void getErr();
   @RequestMapping(value = "/ccc", method = RequestMethod.GET)
   public void getSuccess();
}
