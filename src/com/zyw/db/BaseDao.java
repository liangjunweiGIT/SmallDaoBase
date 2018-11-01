package com.zyw.db;

import com.zyw.db.client.SqlExecutor;
import com.zyw.utils.ProxyUtil;

import java.util.List;

/**
 * @Description:
 * @Author Created by junwei.liang on 2018/10/31 12:58
 */
public class BaseDao {
    private final SqlExecutor sqlExecutor = new SqlExecutor();

    protected int insert(String sql, Object obj) {
        return sqlExecutor.insert(sql, obj);
    }

    protected int update(String sql, Object obj) {
        return sqlExecutor.update(sql, obj);
    }

    protected int delete(String sql, Object obj) {
        return sqlExecutor.delete(sql, obj);
    }

    protected List queryForList(String sql, Class clazz) {
        return sqlExecutor.queryForList(sql, clazz);
    }

    protected List queryForList(String sql, Class clazz, Object obj) {
        return sqlExecutor.queryForList(sql, clazz, obj);
    }

    protected Object queryForObject(String sql, Class clazz) {
        return sqlExecutor.queryForObject(sql, clazz);
    }

    protected Object queryForObject(String sql, Class clazz, Object obj) {
        return sqlExecutor.queryForObject(sql, clazz, obj);
    }
}
