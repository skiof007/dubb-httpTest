package com.test.consumer.controller;

import com.test.consumer.DubboCallbackUtil;
import com.test.consumer.dto.request.CallRequest;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.Map;

/**
 * Created by  on 2017/10/20.
 */
@RestController
@RequestMapping(value = "/consumer")
public class ConsumerController {

    @RequestMapping(value = "/callJson")
    @ResponseBody
    public Object call(@RequestBody CallRequest request) {
        return DubboCallbackUtil.invoke(request.getInterfaceName(), request.getMethod(), request.getParam(), request.getAddress(), request.getVersion());
    }
}




