package com.zyw.db;

import com.zyw.db.client.LjwSqlExecutor;
import com.zyw.db.client.SqlExecutor;

import java.util.List;

/**
 * @Description:
 * @Author Created by junwei.liang on 2018/10/31 12:58
 */
public class BaseDao {
    private final SqlExecutor sqlExecutor = new LjwSqlExecutor();

    protected int insert(String sql, Object obj) {
        return sqlExecutor.insert(sql, obj);
    }

    protected int update(String sql, Object obj) {
        return sqlExecutor.update(sql, obj);
    }

    protected int delete(String sql, Object obj) {
        return sqlExecutor.delete(sql, obj);
    }

    protected <T> List<T> queryForList(String sql, Class<T> clazz) {
        return sqlExecutor.queryForList(sql, clazz);
    }

    protected <T> List<T> queryForList(String sql, Class<T> clazz, Object obj) {
        return sqlExecutor.queryForList(sql, clazz, obj);
    }

    protected <T> T queryForObject(String sql, Class<T> clazz) {
        return sqlExecutor.queryForObject(sql, clazz);
    }

    protected <T> T queryForObject(String sql, Class<T> clazz, Object obj) {
        return sqlExecutor.queryForObject(sql, clazz, obj);
    }
}
