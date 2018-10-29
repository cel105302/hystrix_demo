package com.example.demo.service.fallback;

import com.example.demo.service.HystrixLogIc;
import feign.hystrix.FallbackFactory;
import org.apache.log4j.Logger;
import org.springframework.stereotype.Component;


@Component
public class HystrixLogIcCallbackFanctory implements FallbackFactory<HystrixLogIc> {
    private static final Logger logger = Logger.getLogger(HystrixLogIcCallbackFanctory.class);
    @Override
    public HystrixLogIc create(Throwable cause) {
        logger.error("HystrixLogIc服务调用异常:" , cause);
        return new HystrixLogIc() {
            @Override
            public void getErr() {

            }

            @Override
            public void getSuccess() {

            }
        };
    }
}
