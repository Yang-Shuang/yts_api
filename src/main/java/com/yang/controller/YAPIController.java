package com.yang.controller;

import com.yang.model.RequestBean;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by
 * yangshuang on 2018/8/6.
 */
@RestController
@EnableAutoConfiguration
public class YAPIController {

    @RequestMapping("/hello")
    private String getHello(RequestBean bean) {
        return "This is a hello world test: name:" + bean.getName() + "--age:" + bean.getAge();
    }
}
