package com.yang.service;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.yang.dao.ProvinceDataDao;
import com.yang.model.ProvinceDataBean;
import com.yang.utils.JsonParser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by
 * yangshuang on 2018/8/7.
 */
@Repository("provinceDataListService")
public class ProvinceDataListServiceImpl implements ProvinceDataListService{

    @Autowired
    private ProvinceDataDao provinceDataDao;

    @Override
    public String getAllProvinceJson() {
        List<ProvinceDataBean> beans = provinceDataDao.getDataList(null);

        try {
            return JsonParser.bean2Json(beans);
        } catch (JsonProcessingException e) {
            return e.getMessage();
        }
    }
}
