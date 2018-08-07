package com.yang.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;

/**
 * Created by
 * yangshuang on 2018/8/7.
 */
public abstract class BaseSQLDao {

    @Autowired
    protected JdbcTemplate jdbcTemplate;

    abstract String getTableName();


}
