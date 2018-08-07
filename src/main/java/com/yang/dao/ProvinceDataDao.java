package com.yang.dao;

import com.yang.model.ProvinceDataBean;

import java.util.List;

/**
 * Created by
 * yangshuang on 2018/8/7.
 */
public interface ProvinceDataDao {

    ProvinceDataDao getData(String id);

    List<ProvinceDataBean> getDataList(String condition);
}
