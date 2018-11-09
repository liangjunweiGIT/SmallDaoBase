package com.zyw.db.client;

import java.util.List;

/**
 * @Description: sql执行器
 * @Author Created by junwei.liang on 2018/11/9 14:42
 */
public interface SqlExecutor {

    int insert(String sql, Object obj);

    int update(String sql, Object obj);

    int delete(String sql, Object obj);

    <T> List<T> queryForList(String sql, Class<T> clazz);

    <T> List<T> queryForList(String sql, Class<T> clazz, Object obj);

    <T> T queryForObject(String sql, Class<T> clazz);

    <T> T queryForObject(String sql, Class<T> clazz, Object obj);
}
