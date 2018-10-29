package com.example.demo.controller;

import com.example.demo.service.HystrixLogIc;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hystrix")
public class HystrixLogController {
    @Autowired
    HystrixLogIc hystrixLogIc;

    @GetMapping("/getErr")
    public void getErr(){
        hystrixLogIc.getErr();
    }
}
