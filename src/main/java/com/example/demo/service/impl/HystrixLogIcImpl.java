package com.example.demo.service.impl;

import com.example.demo.service.HystrixLogIc;

public class HystrixLogIcImpl implements HystrixLogIc {
    @Override
    public void getErr() {
        System.out.println(123);
    }

    @Override
    public void getSuccess() {
        System.out.println(222);
    }
}
