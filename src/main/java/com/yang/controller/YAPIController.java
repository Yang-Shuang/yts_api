package com.yang.controller;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.yang.UrlConfig;
import com.yang.model.RequestBean;
import com.yang.service.ProvinceDataListService;
import com.yang.service.ProvinceDataListServiceImpl;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * Created by
 * yangshuang on 2018/8/6.
 */
@RestController
@EnableAutoConfiguration
public class YAPIController {

    @Resource
    ProvinceDataListService provinceDataListService;

    @RequestMapping(UrlConfig.HELLO)
    private String getHello(RequestBean bean) {
        return "This is a hello world test: name:" + bean.getName() + "--age:" + bean.getAge();
    }

    @RequestMapping(path = UrlConfig.GET_DATA, method = RequestMethod.GET)
    private String methodGet(RequestBean bean) {
        return provinceDataListService.getAllProvinceJson();
    }

    @RequestMapping(path = UrlConfig.GET_DATA_LIST, method = RequestMethod.GET,produces = "application/json")
    private String methodGetList(RequestBean bean) {
        return provinceDataListService.getAllProvinceJson();
    }
}
