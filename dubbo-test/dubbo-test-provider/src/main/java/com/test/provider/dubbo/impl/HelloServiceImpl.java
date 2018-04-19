package com.test.provider.dubbo.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.test.service.HelloService;
import org.apache.log4j.Logger;

/**
 * 城市业务 Dubbo 服务层实现层
 * <p>
 * Created by bysocket on 28/02/2017.
 */
// 注册为 Dubbo 服务
@Service(version = "1.0.0")
public class HelloServiceImpl implements HelloService {

    private Logger logger = Logger.getLogger(HelloService.class);

    @Override
    public void sayHello() {
        logger.info("sayHello================");
    }

    @Override
    public String sayHelloStr(String hello) {
        logger.info("sayHelloStr================");
        return hello + System.currentTimeMillis();
    }
}
