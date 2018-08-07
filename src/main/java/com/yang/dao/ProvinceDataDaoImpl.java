package com.yang.dao;

import com.yang.model.ProvinceDataBean;
import com.yang.utils.JsonParser;
import org.springframework.stereotype.Repository;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * Created by
 * yangshuang on 2018/8/7.
 */
@Repository("provinceDataDao")
public class ProvinceDataDaoImpl extends BaseSQLDao implements ProvinceDataDao {
    @Override
    public ProvinceDataDao getData(String id) {
        return null;
    }

    @Override
    public List<ProvinceDataBean> getDataList(String condition) {
        String sql = "SELECT * FROM provinces";
        List<Map<String, Object>> list = jdbcTemplate.queryForList(sql);
        if (list != null && list.size() > 0) {
            List<ProvinceDataBean> beans = new ArrayList<>();
            try {
                String data = JsonParser.bean2Json(list);
                beans = JsonParser.json2List(data, ProvinceDataBean.class);
            } catch (IOException e) {
                e.printStackTrace();
            }
            return beans;
        }
        return null;
    }

    @Override
    String getTableName() {
        return "provinces";
    }
}
