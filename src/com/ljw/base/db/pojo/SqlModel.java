package com.ljw.base.db.pojo;

import java.util.Map;

/**
 * @Description:
 * @Author Created by junwei.liang on 2018/10/31 13:41
 */
public class SqlModel {
    private String sql;
    private Map<Integer, String> properties;

    public String getSql() {
        return sql;
    }

    public void setSql(String sql) {
        this.sql = sql;
    }

    public Map<Integer, String> getProperties() {
        return properties;
    }

    public void setProperties(Map<Integer, String> properties) {
        this.properties = properties;
    }
}
